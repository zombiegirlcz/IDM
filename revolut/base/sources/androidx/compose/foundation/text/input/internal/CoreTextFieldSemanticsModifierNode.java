package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import ri4.o;
import rsl.p;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b1\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ]\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0016J/\u0010\u001e\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b\f\u00101\"\u0004\b6\u00103R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00101¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/input/TransformedText;", "transformedText", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "", "readOnly", "enabled", "isPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "<init>", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "updateNodeSemantics", "", "text", "handleTextUpdateFromSemantics", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Ljava/lang/String;ZZ)V", "Landroidx/compose/ui/text/input/TransformedText;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Z", "getReadOnly", "()Z", "setReadOnly", "(Z)V", "getEnabled", "setEnabled", "setPassword", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    private boolean enabled;

    @NotNull
    private FocusRequester focusRequester;

    @NotNull
    private ImeOptions imeOptions;
    private boolean isPassword;

    @NotNull
    private TextFieldSelectionManager manager;

    @NotNull
    private OffsetMapping offsetMapping;
    private boolean readOnly;

    @NotNull
    private LegacyTextFieldState state;

    @NotNull
    private TransformedText transformedText;

    @NotNull
    private TextFieldValue value;

    public CoreTextFieldSemanticsModifierNode(@NotNull TransformedText transformedText, @NotNull TextFieldValue textFieldValue, @NotNull LegacyTextFieldState legacyTextFieldState, boolean z, boolean z3, boolean z4, @NotNull OffsetMapping offsetMapping, @NotNull TextFieldSelectionManager textFieldSelectionManager, @NotNull ImeOptions imeOptions, @NotNull FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z3;
        this.isPassword = z4;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.setRequestAutofillAction$foundation(new s1.a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$1(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, FillableData fillableData) {
        coreTextFieldSemanticsModifierNode.state.setJustAutofilled(true);
        coreTextFieldSemanticsModifierNode.state.setAutofillHighlightOn(true);
        LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.state;
        CharSequence textValue = fillableData.getTextValue();
        Intrinsics.i(textValue, "null cannot be cast to non-null type kotlin.String");
        coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(legacyTextFieldState, (String) textValue, coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$10(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.cut$foundation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$11(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.paste$foundation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, List list) {
        if (coreTextFieldSemanticsModifierNode.state.getLayoutResult() == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = coreTextFieldSemanticsModifierNode.state.getLayoutResult();
        Intrinsics.h(layoutResult);
        list.add(layoutResult.getValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$3(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, AnnotatedString annotatedString) {
        coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.state, annotatedString.getText(), coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$4(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        if (coreTextFieldSemanticsModifierNode.readOnly || !coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        TextInputSession inputSession = coreTextFieldSemanticsModifierNode.state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onEditCommand$foundation(v.k(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)), coreTextFieldSemanticsModifierNode.state.getProcessor(), coreTextFieldSemanticsModifierNode.state.getOnValueChange(), inputSession);
            return true;
        }
        coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new TextFieldValue(d0.j0(coreTextFieldSemanticsModifierNode.value.getText(), TextRange.m2959getStartimpl(coreTextFieldSemanticsModifierNode.value.getSelection()), TextRange.m2954getEndimpl(coreTextFieldSemanticsModifierNode.value.getSelection()), annotatedString).toString(), TextRangeKt.TextRange(annotatedString.length() + TextRange.m2959getStartimpl(coreTextFieldSemanticsModifierNode.value.getSelection())), (TextRange) null, 4, (DefaultConstructorMarker) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$5(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i, int i2, boolean z) {
        if (!z) {
            i = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i);
        }
        if (!z) {
            i2 = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i2);
        }
        if (!coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        if (i == TextRange.m2959getStartimpl(coreTextFieldSemanticsModifierNode.value.getSelection()) && i2 == TextRange.m2954getEndimpl(coreTextFieldSemanticsModifierNode.value.getSelection())) {
            return false;
        }
        if (Math.min(i, i2) < 0 || Math.max(i, i2) > coreTextFieldSemanticsModifierNode.value.getAnnotatedString().length()) {
            coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
            return false;
        }
        if (z || i == i2) {
            coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
        } else {
            TextFieldSelectionManager.enterSelectionMode$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        }
        coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new TextFieldValue(coreTextFieldSemanticsModifierNode.value.getAnnotatedString(), TextRangeKt.TextRange(i, i2), (TextRange) null, 4, (DefaultConstructorMarker) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$6(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.state.getOnImeActionPerformed().invoke(ImeAction.m3051boximpl(coreTextFieldSemanticsModifierNode.imeOptions.getImeAction()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$7(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        CoreTextFieldKt.tapToFocus(coreTextFieldSemanticsModifierNode.state, coreTextFieldSemanticsModifierNode.focusRequester, !coreTextFieldSemanticsModifierNode.readOnly);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$8(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        TextFieldSelectionManager.enterSelectionMode$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$9(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        TextFieldSelectionManager.copy$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        return true;
    }

    private final void handleTextUpdateFromSemantics(LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        if (readOnly || !enabled) {
            return;
        }
        TextInputSession inputSession = state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onEditCommand$foundation(v.k(new DeleteAllCommand(), new CommitTextCommand(text, 1)), state.getProcessor(), state.getOnValueChange(), inputSession);
        } else {
            state.getOnValueChange().invoke(new TextFieldValue(text, TextRangeKt.TextRange(text.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateNodeSemantics$lambda$0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return Unit.f186387a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m2839setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.getSelection());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.INSTANCE.getText());
        FillableData fillableDataCreateFromText = FillableData_androidKt.createFromText(FillableData.INSTANCE, this.value.getAnnotatedString());
        if (fillableDataCreateFromText != null) {
            SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, fillableDataCreateFromText);
        }
        final int i = 0;
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new Function1(this) { // from class: s1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTextFieldSemanticsModifierNode f259035b;

            {
                this.f259035b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean zApplySemantics$lambda$1;
                switch (i) {
                    case 0:
                        zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(this.f259035b, (FillableData) obj2);
                        break;
                    case 1:
                        zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(this.f259035b, (List) obj2);
                        break;
                    default:
                        zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(this.f259035b, (AnnotatedString) obj2);
                        break;
                }
                return Boolean.valueOf(zApplySemantics$lambda$1);
            }
        }, 1, null);
        int iM3069getKeyboardTypePjHm6EE = this.imeOptions.getKeyboardType();
        KeyboardType.Companion companion = KeyboardType.INSTANCE;
        if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion.m3092getEmailPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.INSTANCE.getEmailAddress());
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion.m3095getPasswordPjHm6EE()) || KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion.m3094getNumberPasswordPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.INSTANCE.getPassword());
        } else if (KeyboardType.m3086equalsimpl0(iM3069getKeyboardTypePjHm6EE, companion.m3096getPhonePjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.INSTANCE.getPhoneNumber());
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        boolean z = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        final int i2 = 1;
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1(this) { // from class: s1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreTextFieldSemanticsModifierNode f259035b;

            {
                this.f259035b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean zApplySemantics$lambda$1;
                switch (i2) {
                    case 0:
                        zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(this.f259035b, (FillableData) obj2);
                        break;
                    case 1:
                        zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(this.f259035b, (List) obj2);
                        break;
                    default:
                        zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(this.f259035b, (AnnotatedString) obj2);
                        break;
                }
                return Boolean.valueOf(zApplySemantics$lambda$1);
            }
        }, 1, null);
        if (z) {
            final int i3 = 2;
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1(this) { // from class: s1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CoreTextFieldSemanticsModifierNode f259035b;

                {
                    this.f259035b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean zApplySemantics$lambda$1;
                    switch (i3) {
                        case 0:
                            zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(this.f259035b, (FillableData) obj2);
                            break;
                        case 1:
                            zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(this.f259035b, (List) obj2);
                            break;
                        default:
                            zApplySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(this.f259035b, (AnnotatedString) obj2);
                            break;
                    }
                    return Boolean.valueOf(zApplySemantics$lambda$1);
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new p(this, semanticsPropertyReceiver, 27), 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new o(this, 21), 1, null);
        SemanticsPropertiesKt.m2836onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.getImeAction(), null, new s1.a(this, 6), 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new s1.a(this, 7), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new s1.a(this, 1), 1, null);
        if (!TextRange.m2953getCollapsedimpl(this.value.getSelection()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new s1.a(this, 2), 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new s1.a(this, 3), 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new s1.a(this, 5), 1, null);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* JADX INFO: renamed from: getShouldMergeDescendantSemantics */
    public boolean getMergeDescendants() {
        return true;
    }

    public final void updateNodeSemantics(@NotNull TransformedText transformedText, @NotNull TextFieldValue value, @NotNull LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, @NotNull OffsetMapping offsetMapping, @NotNull TextFieldSelectionManager manager, @NotNull ImeOptions imeOptions, @NotNull FocusRequester focusRequester) {
        boolean z = this.enabled;
        boolean z3 = false;
        boolean z4 = z && !this.readOnly;
        boolean z6 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager = this.manager;
        if (enabled && !readOnly) {
            z3 = true;
        }
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != z || z3 != z4 || !Intrinsics.f(imeOptions, imeOptions2) || isPassword != z6 || !TextRange.m2953getCollapsedimpl(value.getSelection())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (Intrinsics.f(manager, textFieldSelectionManager)) {
            return;
        }
        manager.setRequestAutofillAction$foundation(new s1.a(this, 0));
    }
}
