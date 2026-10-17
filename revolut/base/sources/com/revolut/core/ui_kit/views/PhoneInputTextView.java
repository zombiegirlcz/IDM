package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import mx0.gb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003)*)J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$¨\u0006+"}, d2 = {"Lcom/revolut/core/ui_kit/views/PhoneInputTextView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit/models/Clause;", "placeholder", "", "setPlaceholder", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "phoneCountryCode", "Lwi0/b;", "country", "setPhoneCountryCode", "(Ljava/lang/String;Lwi0/b;)V", "phone", "setPhoneNumber", "(Ljava/lang/String;)V", "error", "setError", "", "enabled", "setCountryCodeInputEnabled", "(Z)V", "hintCode", "setHintCode", "hintPhone", "setHintPhone", "Lyem/h;", "b", "Lkotlin/Lazy;", "getPhoneNumberUtil", "()Lyem/h;", "phoneNumberUtil", "Lcom/revolut/core/ui_kit/views/input/InputText;", "e", "Le8/q;", "getCountryCodeInput", "()Lcom/revolut/core/ui_kit/views/input/InputText;", "countryCodeInput", "f", "getPhoneNumberInput", "phoneNumberInput", "mx0/gb", "bzl/j", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneInputTextView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f58821g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PhoneNumberFormattingTextWatcher f58822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f58823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f58824c;
    public final ihm.f d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q countryCodeInput;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q phoneNumberInput;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneInputTextView(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputText getCountryCodeInput() {
        return (InputText) this.countryCodeInput.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputText getPhoneNumberInput() {
        return (InputText) this.phoneNumberInput.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final yem.h getPhoneNumberUtil() {
        Object value = this.f58823b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yem.h) value;
    }

    public final efm.r d() {
        efm.r rVarMergeWith = getCountryCodeInput().s().mergeWith(this.f58824c);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    public final ihm.f e() {
        return getCountryCodeInput().u0;
    }

    public final efm.r f() {
        return getPhoneNumberInput().x0();
    }

    public final void g() {
        getPhoneNumberInput().C0(true);
        getPhoneNumberInput().B0();
    }

    public final void setCountryCodeInputEnabled(boolean enabled) {
        getCountryCodeInput().setEnabled(enabled);
    }

    public final void setError(Clause error) {
        getPhoneNumberInput().setError(error != null);
        getPhoneNumberInput().setHelperText(error);
    }

    public final void setHintCode(@NotNull Clause hintCode) {
        Intrinsics.checkNotNullParameter(hintCode, "hintCode");
        getCountryCodeInput().setLabel(hintCode);
    }

    public final void setHintPhone(@NotNull Clause hintPhone) {
        Intrinsics.checkNotNullParameter(hintPhone, "hintPhone");
        getPhoneNumberInput().setLabel(hintPhone);
    }

    public final void setPhoneCountryCode(@NotNull String phoneCountryCode, @NotNull wi0.b country) {
        Intrinsics.checkNotNullParameter(phoneCountryCode, "phoneCountryCode");
        Intrinsics.checkNotNullParameter(country, "country");
        InputText.setText$default(getCountryCodeInput(), new TextClause(phoneCountryCode, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
        getCountryCodeInput().setPrefixIconImage(new CountryImage(country.f297794a, (Integer) null, (ez0.e) null, 14));
        InputText phoneNumberInput = getPhoneNumberInput();
        phoneNumberInput.A0(this.f58822a);
        String str = country.f297794a;
        this.f58822a = new gb(this, str);
        CharSequence text = getPhoneNumberInput().getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb6 = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = text.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        String str2 = phoneCountryCode + ((Object) sb6);
        yem.h phoneNumberUtil = getPhoneNumberUtil();
        phoneNumberUtil.getClass();
        yem.a aVar = new yem.a(phoneNumberUtil, str);
        int iP = d0.P(str2);
        for (int i2 = 0; i2 < iP; i2++) {
            aVar.g(str2.charAt(i2));
        }
        String strG = aVar.g(str2.charAt(d0.P(str2)));
        Intrinsics.checkNotNullExpressionValue(strG, "inputDigit(...)");
        String string = d0.J0(a0.D(strG, phoneCountryCode, "", false)).toString();
        if (!d0.W(string)) {
            setPhoneNumber(string);
        }
        phoneNumberInput.r0(this.f58822a);
    }

    public final void setPhoneNumber(@NotNull String phone) {
        StringBuilder sb6;
        boolean z;
        Intrinsics.checkNotNullParameter(phone, "phone");
        CharSequence text = getPhoneNumberInput().getText();
        if (text != null) {
            sb6 = new StringBuilder();
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = text.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb6.append(cCharAt);
                }
            }
        } else {
            sb6 = null;
        }
        if (sb6 == phone) {
            z = true;
        } else {
            z = false;
            if (sb6 != null && phone != null && sb6.length() == phone.length()) {
                int length2 = sb6.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    if (sb6.charAt(i2) != phone.charAt(i2)) {
                        break;
                    }
                }
                z = true;
            }
        }
        if (z) {
            return;
        }
        InputText.setText$default(getPhoneNumberInput(), new TextClause(phone, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
        InputText phoneNumberInput = getPhoneNumberInput();
        CharSequence text2 = getPhoneNumberInput().getText();
        phoneNumberInput.setSelection(text2 != null ? text2.length() : phone.length());
    }

    public final void setPlaceholder(@NotNull Clause placeholder) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        getPhoneNumberInput().setPlaceholder(placeholder, rx0.j.OnFocus);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneInputTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneInputTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhoneInputTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, 0);
        this.f58822a = new PhoneNumberFormattingTextWatcher();
        this.f58823b = te0.w.y0(new lu0.a(context, 13));
        this.f58824c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.countryCodeInput = kli.a.J(R$id.inputPhone_code, this);
        this.phoneNumberInput = kli.a.J(R$id.inputPhone_number, this);
        View.inflate(context, R$layout.internal_view_phone_input, this);
        getCountryCodeInput().setFocusable(false);
        getCountryCodeInput().setSingleLine(true);
        getCountryCodeInput().P = true;
        getPhoneNumberInput().setSharingEnabled(false);
        getPhoneNumberInput().setSingleLine(true);
        getPhoneNumberInput().P = true;
        getPhoneNumberInput().setInputType(524291);
        getPhoneNumberInput().setEnableQuickClear(true);
        getPhoneNumberInput().r0(this.f58822a);
        getCountryCodeInput().setInputFilters(zhm.u.c(new bzl.j(this, 1)));
        getCountryCodeInput().setTextIsImportantForAutofill(1);
        getCountryCodeInput().setTextAutofillHints("phoneCountryCode");
        getPhoneNumberInput().setTextIsImportantForAutofill(1);
        getPhoneNumberInput().setTextAutofillHints("phoneNational");
        setLayoutDirection(0);
    }
}
