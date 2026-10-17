package com.revolut.uicomponent.text;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import au0.l4;
import aw0.o9;
import bzl.i;
import bzl.j;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.R$string;
import com.revolut.uicomponent.text.PhoneEditorView;
import j6.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import yem.h;
import yhm.d;
import yp0.r;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 @2\u00020\u0001:\u0004\fABCB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020 ¢\u0006\u0004\b\u001f\u0010!J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0017R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010*\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u00104\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u00103R#\u00107\u001a\n 0*\u0004\u0018\u00010/0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u00103R\u0011\u00109\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b8\u0010.R\u0011\u0010;\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b:\u0010.R\u0011\u0010=\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b<\u0010.R\u0011\u0010?\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b>\u0010.¨\u0006D"}, d2 = {"Lcom/revolut/uicomponent/text/PhoneEditorView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lbzl/i;", "listener", "", "setListener", "(Lbzl/i;)V", "Lkotlin/Function0;", "setDoneListener", "(Lkotlin/jvm/functions/Function0;)V", "", "hintPhone", "setHintPhone", "(Ljava/lang/String;)V", "hintCode", "setHintCode", "code", "isoCode", "setCode", "(Ljava/lang/String;Ljava/lang/String;)V", "phone", "setPhone", "", "(J)V", "error", "setError", "Lyem/h;", "c", "Lkotlin/Lazy;", "getPhoneNumberUtil", "()Lyem/h;", "phoneNumberUtil", "value", "d", "Ljava/lang/String;", "getIsoCode", "()Ljava/lang/String;", "Lcom/revolut/core/ui_kit/views/input/InputText;", "kotlin.jvm.PlatformType", "e", "getUicEditCountryCode", "()Lcom/revolut/core/ui_kit/views/input/InputText;", "uicEditCountryCode", "f", "getUicEditPhoneNumber", "uicEditPhoneNumber", "getPhoneNumber", "phoneNumber", "getPhoneCode", "phoneCode", "getNationalNumber", "nationalNumber", "getPhoneWithCode", "phoneWithCode", "Companion", "bzl/h", "bzl/j", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class PhoneEditorView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Regex f107275g = new Regex("\\D");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f107276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PhoneNumberFormattingTextWatcher f107277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f107278c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String isoCode;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: com.revolut.uicomponent.text.PhoneEditorView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneEditorView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107277b = new PhoneNumberFormattingTextWatcher();
        final int i = 0;
        this.f107278c = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i2) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        final int i2 = 1;
        this.e = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        final int i3 = 2;
        this.f = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h getPhoneNumberUtil() {
        Object value = this.f107278c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final InputText getUicEditCountryCode() {
        return (InputText) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputText getUicEditPhoneNumber() {
        return (InputText) this.f.getValue();
    }

    public final void c() {
        View.inflate(getContext(), R$layout.view_phone_editor, this);
        getUicEditCountryCode().setSingleLine(true);
        InputText uicEditCountryCode = getUicEditCountryCode();
        Intrinsics.checkNotNullExpressionValue(uicEditCountryCode, "<get-uicEditCountryCode>(...)");
        ResourceImage resourceImage = r.f315752a;
        Intrinsics.checkNotNullParameter(uicEditCountryCode, "<this>");
        uicEditCountryCode.setMainIconImage(r.f315752a);
        uicEditCountryCode.setFocusable(false);
        getUicEditPhoneNumber().setInputType(524291);
        getUicEditPhoneNumber().setSingleLine(true);
        getUicEditPhoneNumber().setLabel(getContext().getString(R$string.phone_input_phone_number_label));
        getUicEditPhoneNumber().setEnableQuickClear(true);
        getUicEditCountryCode().setInputFilters(u.c(new j(this, 0)));
        getUicEditCountryCode().setTextIsImportantForAutofill(1);
        getUicEditCountryCode().setTextAutofillHints("phoneCountryCode");
        getUicEditPhoneNumber().setTextIsImportantForAutofill(1);
        getUicEditPhoneNumber().setTextAutofillHints("phoneNational");
        InputText uicEditPhoneNumber = getUicEditPhoneNumber();
        uicEditPhoneNumber.r0(this.f107277b);
        uicEditPhoneNumber.setOnEditorActionListener(new l4(this, 1));
    }

    public final String getIsoCode() {
        return this.isoCode;
    }

    @NotNull
    public final String getNationalNumber() {
        return f107275g.replace(getPhoneNumber(), "");
    }

    @NotNull
    public final String getPhoneCode() {
        return String.valueOf(getUicEditCountryCode().getText());
    }

    @NotNull
    public final String getPhoneNumber() {
        return String.valueOf(getUicEditPhoneNumber().getText());
    }

    @NotNull
    public final String getPhoneWithCode() {
        return a.q("+", f107275g.replace(a0.d.r(getPhoneCode(), getPhoneNumber()), ""));
    }

    public final void setCode(@NotNull String code, String isoCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.isoCode = isoCode;
        InputText uicEditCountryCode = getUicEditCountryCode();
        Intrinsics.checkNotNullExpressionValue(uicEditCountryCode, "<get-uicEditCountryCode>(...)");
        InputText.setText$default(uicEditCountryCode, new TextClause(code, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
        InputText uicEditPhoneNumber = getUicEditPhoneNumber();
        uicEditPhoneNumber.getInnerEditText().removeTextChangedListener(this.f107277b);
        this.f107277b = isoCode != null ? new bzl.h(this, isoCode) : new bzl.h(this);
        String strReplace = f107275g.replace(String.valueOf(getUicEditPhoneNumber().getText()), "");
        if (isoCode != null) {
            String strR = a0.d.r(code, strReplace);
            h phoneNumberUtil = getPhoneNumberUtil();
            phoneNumberUtil.getClass();
            yem.a aVar = new yem.a(phoneNumberUtil, isoCode);
            int iP = d0.P(strR);
            for (int i = 0; i < iP; i++) {
                aVar.g(strR.charAt(i));
            }
            String strG = aVar.g(strR.charAt(d0.P(strR)));
            Intrinsics.checkNotNullExpressionValue(strG, "inputDigit(...)");
            strReplace = d0.J0(a0.D(strG, code, "", false)).toString();
        }
        if (!d0.W(strReplace)) {
            setPhone(strReplace);
        }
        uicEditPhoneNumber.getInnerEditText().addTextChangedListener(this.f107277b);
    }

    public final void setDoneListener(Function0<Unit> listener) {
        this.f107276a = listener;
    }

    public final void setError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getUicEditPhoneNumber().setHelperText(error);
        getUicEditPhoneNumber().setError(true);
    }

    public final void setHintCode(@NotNull String hintCode) {
        Intrinsics.checkNotNullParameter(hintCode, "hintCode");
        getUicEditCountryCode().setLabel(hintCode);
    }

    public final void setHintPhone(@NotNull String hintPhone) {
        Intrinsics.checkNotNullParameter(hintPhone, "hintPhone");
        getUicEditPhoneNumber().setLabel(hintPhone);
    }

    public final void setListener(i listener) {
    }

    public final void setPhone(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        InputText uicEditPhoneNumber = getUicEditPhoneNumber();
        Intrinsics.checkNotNullExpressionValue(uicEditPhoneNumber, "<get-uicEditPhoneNumber>(...)");
        InputText.setText$default(uicEditPhoneNumber, new TextClause(phone, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
        InputText uicEditPhoneNumber2 = getUicEditPhoneNumber();
        CharSequence text = getUicEditPhoneNumber().getText();
        uicEditPhoneNumber2.setSelection(text != null ? text.length() : phone.length());
    }

    public final void setPhone(long phone) {
        setPhone(String.valueOf(phone));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneEditorView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f107277b = new PhoneNumberFormattingTextWatcher();
        final int i = 0;
        this.f107278c = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        final int i2 = 1;
        this.e = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        final int i3 = 2;
        this.f = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneEditorView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f107277b = new PhoneNumberFormattingTextWatcher();
        final int i2 = 0;
        this.f107278c = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        final int i3 = 1;
        this.e = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        final int i5 = 2;
        this.f = w.y0(new Function0(this) { // from class: bzl.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneEditorView f20064b;

            {
                this.f20064b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PhoneEditorView phoneEditorView = this.f20064b;
                switch (i22) {
                    case 0:
                        PhoneEditorView.Companion companion = PhoneEditorView.INSTANCE;
                        return yem.h.b(phoneEditorView.getContext());
                    case 1:
                        PhoneEditorView.Companion companion2 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_country_code);
                    default:
                        PhoneEditorView.Companion companion3 = PhoneEditorView.INSTANCE;
                        return (InputText) phoneEditorView.findViewById(R$id.uic_edit_phone_number);
                }
            }
        });
        c();
    }
}
