package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\nR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b$\u0010\nR&\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\nR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b)\u0010\nR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b+\u0010\nR&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\b\u0012\u0004\b.\u0010\u0003\u001a\u0004\b-\u0010\nR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b0\u0010\nR\u001d\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b3\u0010\nR\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b6\u0010\nR\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\b\u001a\u0004\b9\u0010\nR\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\b\u001a\u0004\b<\u0010\nR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b?\u0010\nR\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020=0\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\b\u001a\u0004\bA\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bE\u0010\nR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\b\u001a\u0004\bH\u0010\nR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bJ\u0010\nR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bL\u0010\nR#\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0\u00050\u00048\u0006¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bO\u0010\nR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u00048\u0006¢\u0006\f\n\u0004\bP\u0010\b\u001a\u0004\bQ\u0010\nR\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\b\u001a\u0004\bS\u0010\nR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020M0\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\b\u001a\u0004\bU\u0010\nR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020M0\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\b\u001a\u0004\bW\u0010\nR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\b\u001a\u0004\bZ\u0010\nR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\b\u001a\u0004\b]\u0010\nR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\b\u001a\u0004\b_\u0010\nR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\b\u001a\u0004\bb\u0010\nR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\b\u001a\u0004\bd\u0010\nR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\be\u0010\b\u001a\u0004\bf\u0010\nR)\u0010i\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020h0g0\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\b\u001a\u0004\bj\u0010\nR\u001d\u0010k\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\b\u001a\u0004\bl\u0010\nR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020h0\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\b\u001a\u0004\bn\u0010\nR\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u00048\u0006¢\u0006\f\n\u0004\bp\u0010\b\u001a\u0004\bq\u0010\n¨\u0006r"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "ContentDescription", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "StateDescription", "getStateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ProgressBarRangeInfo", "getProgressBarRangeInfo", "PaneTitle", "getPaneTitle", "", "SelectableGroup", "getSelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "CollectionInfo", "getCollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "CollectionItemInfo", "getCollectionItemInfo", "Heading", "getHeading", "Disabled", "getDisabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "LiveRegion", "getLiveRegion", "", "Focused", "getFocused", "IsContainer", "getIsContainer", "getIsContainer$annotations", "IsTraversalGroup", "getIsTraversalGroup", "IsSensitiveData", "getIsSensitiveData", "InvisibleToUser", "getInvisibleToUser", "getInvisibleToUser$annotations", "HideFromAccessibility", "getHideFromAccessibility", "Landroidx/compose/ui/autofill/ContentType;", "ContentType", "getContentType", "Landroidx/compose/ui/autofill/ContentDataType;", "ContentDataType", "getContentDataType", "Landroidx/compose/ui/autofill/FillableData;", "FillableData", "getFillableData", "", "TraversalIndex", "getTraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "HorizontalScrollAxisRange", "getHorizontalScrollAxisRange", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "IsPopup", "getIsPopup", "IsDialog", "getIsDialog", "Landroidx/compose/ui/semantics/Role;", "Role", "getRole", "TestTag", "getTestTag", "LinkTestMarker", "getLinkTestMarker", "Landroidx/compose/ui/text/AnnotatedString;", "Text", "getText", "TextSubstitution", "getTextSubstitution", "IsShowingTextSubstitution", "getIsShowingTextSubstitution", "InputText", "getInputText", "EditableText", "getEditableText", "Landroidx/compose/ui/text/TextRange;", "TextSelectionRange", "getTextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "ImeAction", "getImeAction", "Selected", "getSelected", "Landroidx/compose/ui/state/ToggleableState;", "ToggleableState", "getToggleableState", "Password", "getPassword", "Error", "getError", "Lkotlin/Function1;", "", "IndexForKey", "getIndexForKey", "IsEditable", "getIsEditable", "MaxTextLength", "getMaxTextLength", "Landroidx/compose/ui/graphics/Shape;", "Shape", "getShape", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SemanticsProperties {

    @NotNull
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    @NotNull
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", true, SemanticsProperties$ContentDescription$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", true);

    @NotNull
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", true);

    @NotNull
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", true, SemanticsProperties$PaneTitle$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<Unit> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", true);

    @NotNull
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", true);

    @NotNull
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", true);

    @NotNull
    private static final SemanticsPropertyKey<Unit> Heading = new SemanticsPropertyKey<>("Heading", true);

    @NotNull
    private static final SemanticsPropertyKey<Unit> Disabled = new SemanticsPropertyKey<>("Disabled", true);

    @NotNull
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", true);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", true);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsContainer = new SemanticsPropertyKey<>("IsContainer", true);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsSensitiveData = new SemanticsPropertyKey<>("IsSensitiveData", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);

    @NotNull
    private static final SemanticsPropertyKey<Unit> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", SemanticsProperties$HideFromAccessibility$1.INSTANCE);

    @NotNull
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", SemanticsProperties$ContentType$1.INSTANCE);

    @NotNull
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", SemanticsProperties$ContentDataType$1.INSTANCE);

    @NotNull
    private static final SemanticsPropertyKey<FillableData> FillableData = new SemanticsPropertyKey<>("FillableData", SemanticsProperties$FillableData$1.INSTANCE);

    @NotNull
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", SemanticsProperties$TraversalIndex$1.INSTANCE);

    @NotNull
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", true);

    @NotNull
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", true);

    @NotNull
    private static final SemanticsPropertyKey<Unit> IsPopup = new SemanticsPropertyKey<>("IsPopup", true, SemanticsProperties$IsPopup$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<Unit> IsDialog = new SemanticsPropertyKey<>("IsDialog", true, SemanticsProperties$IsDialog$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", true, SemanticsProperties$Role$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, SemanticsProperties$TestTag$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<Unit> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, SemanticsProperties$LinkTestMarker$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", true, SemanticsProperties$Text$1.INSTANCE, null, 8, null);

    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> InputText = new SemanticsPropertyKey<>("InputText", true);

    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", true);

    @NotNull
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", true);

    @NotNull
    private static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", true);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", true);

    @NotNull
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", true);

    @NotNull
    private static final SemanticsPropertyKey<Unit> Password = new SemanticsPropertyKey<>("Password", true);

    @NotNull
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", true);

    @NotNull
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", (Function2) null, 2, (DefaultConstructorMarker) null);

    @NotNull
    private static final SemanticsPropertyKey<Shape> Shape = new SemanticsPropertyKey<>("Shape", false, SemanticsProperties$Shape$1.INSTANCE, null, 8, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    @NotNull
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getDisabled() {
        return Disabled;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    @NotNull
    public final SemanticsPropertyKey<FillableData> getFillableData() {
        return FillableData;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getHeading() {
        return Heading;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    @NotNull
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getInvisibleToUser() {
        return InvisibleToUser;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsDialog() {
        return IsDialog;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getIsPopup() {
        return IsPopup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsSensitiveData() {
        return IsSensitiveData;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getLinkTestMarker() {
        return LinkTestMarker;
    }

    @NotNull
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    @NotNull
    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getPassword() {
        return Password;
    }

    @NotNull
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    @NotNull
    public final SemanticsPropertyKey<Unit> getSelectableGroup() {
        return SelectableGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    @NotNull
    public final SemanticsPropertyKey<Shape> getShape() {
        return Shape;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    @NotNull
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    @NotNull
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    @NotNull
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    @NotNull
    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }
}
