package com.revolut.uicomponent.products;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$layout;
import com.revolut.uicomponent.text.masked.MaskedEditText;
import cw6.m;
import ip0.l7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import umd.n;
import uyl.e;
import uyl.f;
import uyl.g;
import uyl.h;
import uyl.i;
import w01.k;
import zhm.f0;
import zhm.p;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0003\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/uicomponent/products/EditTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/uicomponent/products/EditTextDelegate$b;", "Luyl/f;", "Companion", "uyl/i", "uyl/h", "b", "Content", "uyl/g", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class EditTextDelegate extends BaseRecyclerViewDelegate<b, f> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f107164c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f107165g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/uicomponent/products/EditTextDelegate$Content;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f107168c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Content(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(String rawValue, String formattedValue, boolean z) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
            this.f107166a = rawValue;
            this.f107167b = formattedValue;
            this.f107168c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Content)) {
                return false;
            }
            Content content = (Content) obj2;
            return Intrinsics.f(this.f107166a, content.f107166a) && Intrinsics.f(this.f107167b, content.f107167b) && this.f107168c == content.f107168c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f107168c) + p.a.c(this.f107166a.hashCode() * 31, 31, this.f107167b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f107166a);
            dest.writeString(this.f107167b);
            dest.writeInt(this.f107168c ? 1 : 0);
        }
    }

    public static final class b implements j, o31.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f107171c;
        public final String d;
        public final i e;
        public final int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f107172g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f107173h;
        public final g i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f107174j;
        public p31.c k;

        public b() {
            i style = i.EDITOR;
            f0 validators = f0.f322471a;
            g layout = g.DEFAULT;
            Intrinsics.checkNotNullParameter("", "listId");
            Intrinsics.checkNotNullParameter("", "text");
            Intrinsics.checkNotNullParameter("", "hint");
            Intrinsics.checkNotNullParameter("", "floatingLabel");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(validators, "validators");
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f107169a = "";
            this.f107170b = "";
            this.f107171c = "";
            this.d = "";
            this.e = style;
            this.f = 16385;
            this.f107172g = validators;
            this.f107173h = true;
            this.i = layout;
            this.f107174j = null;
            this.k = null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF52354a() {
            return this.f107169a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f107169a, bVar.f107169a) && Intrinsics.f(this.f107170b, bVar.f107170b) && Intrinsics.f(this.f107171c, bVar.f107171c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f107172g, bVar.f107172g) && this.f107173h == bVar.f107173h && this.i == bVar.i && Intrinsics.f(this.f107174j, bVar.f107174j) && Intrinsics.f(this.k, bVar.k);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.i.hashCode() + j6.a.b(0, j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.d(j6.a.c(j6.a.c(j6.a.b(this.f, (this.e.hashCode() + j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(this.f107169a.hashCode() * 961, 31, this.f107170b), 29791, this.f107171c), 961, this.d), 31, false), 31, false)) * 31, 28629151), 31, false), 961, false), 31, this.f107172g), 31, false), 31, false), 961, this.f107173h), 31, false), 961)) * 31, 31, false), 31, false), 29791, false), 961, false);
            p31.c cVar = this.f107174j;
            int iHashCode = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.k;
            return (iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i */
        public final p31.c getF52364q() {
            return this.f107174j;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k */
        public final p31.c getF52365r() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q */
        public final p31.c getF52367t() {
            return null;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r */
        public final p31.c getF52366s() {
            return null;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f107174j = cVar;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.k = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            b bVar = oldItem instanceof b ? (b) oldItem : null;
            if (bVar == null) {
                return null;
            }
            String str = bVar.f107170b;
            String str2 = this.f107170b;
            String str3 = !Intrinsics.f(str, str2) ? str2 : null;
            i iVar = bVar.e;
            i iVar2 = this.e;
            i iVar3 = iVar != iVar2 ? iVar2 : null;
            String str4 = bVar.d;
            String str5 = this.d;
            String str6 = !Intrinsics.f(str4, str5) ? str5 : null;
            String str7 = bVar.f107171c;
            String str8 = this.f107171c;
            String str9 = !Intrinsics.f(str7, str8) ? str8 : null;
            int i = bVar.f;
            int i2 = this.f;
            return new h(str3, null, null, iVar3, null, str6, null, str9, i != i2 ? Integer.valueOf(i2) : null, null, null, null, null, null);
        }
    }

    public EditTextDelegate() {
        this(0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new f(s.r(parent, this.f98535a));
    }

    public final void p(MaskedEditText maskedEditText, b bVar) {
        bVar.getClass();
        i iVar = bVar.e;
        maskedEditText.setFloatingLabel(2);
        int[] iArr = uyl.j.f284468a;
        switch (iArr[iVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                maskedEditText.setFocusable(true);
                maskedEditText.setFocusableInTouchMode(true);
                maskedEditText.setCursorVisible(true);
                maskedEditText.setEnabled(true);
                maskedEditText.setOnClickListener(null);
                int i = iArr[iVar.ordinal()];
                if (i == 1) {
                    maskedEditText.setHideUnderline(true);
                    maskedEditText.setFloatingLabel(0);
                    return;
                }
                if (i == 2) {
                    maskedEditText.setHideUnderline(true);
                    maskedEditText.setEnabled(false);
                    return;
                }
                if (i == 3) {
                    maskedEditText.setEnabled(false);
                    return;
                }
                if (i == 4) {
                    InputFilter[] filters = maskedEditText.getFilters();
                    Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
                    maskedEditText.setFilters((InputFilter[]) p.y(new m(7), filters));
                    return;
                } else {
                    if (i != 5) {
                        return;
                    }
                    InputFilter[] filters2 = maskedEditText.getFilters();
                    Intrinsics.checkNotNullExpressionValue(filters2, "getFilters(...)");
                    Context context = maskedEditText.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    maskedEditText.setFilters((InputFilter[]) p.y(new bzl.c(jh.d.e(context)), filters2));
                    return;
                }
            case 6:
            case 7:
            case 9:
                maskedEditText.setFocusable(false);
                maskedEditText.setFocusableInTouchMode(false);
                maskedEditText.setCursorVisible(false);
                int i2 = iArr[iVar.ordinal()];
                if (i2 == 6) {
                    maskedEditText.setEnabled(true);
                    maskedEditText.setOnClickListener(new e(this, bVar, 1));
                    return;
                } else if (i2 != 7) {
                    maskedEditText.setEnabled(false);
                    maskedEditText.setOnClickListener(null);
                    return;
                } else {
                    maskedEditText.setEnabled(true);
                    maskedEditText.setOnClickListener(null);
                    return;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(f holder, b data, int i, List payloads) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        MaskedEditText maskedEditText = holder.f;
        ProgressBar progressBar = holder.f284457j;
        AppCompatRadioButton appCompatRadioButton = holder.k;
        TextView textView = holder.f284456h;
        TextView textView2 = holder.i;
        ImageView imageView = holder.f284455g;
        if (payloads.isEmpty()) {
            data.getClass();
            String str = data.f107170b;
            String str2 = data.d;
            CharSequence charSequence = data.f107171c;
            k.e(appCompatRadioButton, false);
            appCompatRadioButton.setChecked(false);
            appCompatRadioButton.setOnClickListener(new e(this, data, 0));
            maskedEditText.setFilters((InputFilter[]) new ArrayList().toArray(new InputFilter[0]));
            k.e(textView2, false);
            int inputType = maskedEditText.getInputType();
            int i5 = data.f;
            if (inputType != i5) {
                maskedEditText.setRawInputType(i5);
            }
            String str3 = data.f107169a + ((Object) null);
            HashMap map = this.f107165g;
            Object kVar = map.get(str3);
            if (kVar == null) {
                kVar = new bzl.k(new com.revolut.uicomponent.products.b(textView2, this, data));
                Intrinsics.checkNotNullParameter(map, "<this>");
                map.put(str3, kVar);
            }
            maskedEditText.setTextChangedListener((TextWatcher) kVar);
            cj9.c.J(maskedEditText, str);
            textView2.setText(String.valueOf(str.length()));
            Editable text = maskedEditText.getText();
            if (text != null) {
                maskedEditText.setSelection(text.length());
            }
            maskedEditText.setSingleLine(data.f107173h);
            qyl.c cVar = holder.f284458l;
            if (cVar != null) {
                EditText editText = cVar.f250300a;
                ((yz0.a) editText).b(cVar.e);
                editText.removeTextChangedListener(cVar.f);
                cVar.f250301b.setHint((CharSequence) null);
                editText.setHint((CharSequence) null);
                cVar.f250302c = null;
                cVar.d = null;
            }
            holder.f284458l = null;
            if (!Intrinsics.f(maskedEditText.getHint(), charSequence)) {
                maskedEditText.setHint(charSequence);
            }
            if (str2.length() > 0) {
                if (!Intrinsics.f(maskedEditText.getFloatingLabelText(), str2)) {
                    maskedEditText.setFloatingLabelText(str2);
                }
            } else if (!Intrinsics.f(maskedEditText.getFloatingLabelText(), charSequence)) {
                maskedEditText.setFloatingLabelText(charSequence);
            }
            p(maskedEditText, data);
            maskedEditText.setGravity(8388659);
            k.e(textView, false);
            if (!Intrinsics.f(maskedEditText.getError(), null)) {
                maskedEditText.setError((CharSequence) null);
            }
            maskedEditText.a(new l7(this, data, 2));
            k.e(imageView, false);
            maskedEditText.setPaddings(0, 0, 0, 0);
            imageView.setOnClickListener(null);
            maskedEditText.setAutoValidate(false);
            maskedEditText.setValidateOnFocusLost(false);
            Iterator it8 = data.f107172g.iterator();
            while (it8.hasNext()) {
                c cVar2 = new c("", (Function0) it8.next());
                if (maskedEditText.f139233s0 == null) {
                    maskedEditText.f139233s0 = new ArrayList();
                }
                maskedEditText.f139233s0.add(cVar2);
            }
            i2 = 0;
            k.e(progressBar, false);
            maskedEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            maskedEditText.setOnTouchListener(null);
            maskedEditText.setInputType(maskedEditText.getInputType() & (-524289));
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.uicomponent.products.EditTextDelegate.Payload");
                h hVar = (h) obj2;
                Integer num = hVar.f284464j;
                String str4 = hVar.f284459a;
                if (str4 != null) {
                    TextWatcher textChangedListener = maskedEditText.getTextChangedListener();
                    maskedEditText.setTextChangedListener(null);
                    cj9.c.J(maskedEditText, str4);
                    textView2.setText(String.valueOf(data.f107170b.length()));
                    maskedEditText.setTextChangedListener(textChangedListener);
                }
                Integer num2 = hVar.f284460b;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    ArrayList arrayList = new ArrayList();
                    i3 = -524289;
                    arrayList.add(new InputFilter.LengthFilter(iIntValue));
                    data.getClass();
                    maskedEditText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
                } else {
                    i3 = -524289;
                }
                Boolean bool = hVar.f284461c;
                if (bool != null) {
                    k.e(textView2, bool.booleanValue());
                }
                maskedEditText.setError((CharSequence) null);
                if (hVar.d != null) {
                    p(maskedEditText, data);
                }
                k.e(textView, false);
                Boolean bool2 = hVar.e;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bool2 = null;
                    }
                    if (bool2 != null) {
                        maskedEditText.requestFocus();
                        Editable text2 = maskedEditText.getText();
                        if (text2 != null) {
                            maskedEditText.setSelection(text2.length());
                        }
                        kli.c.d(maskedEditText, 300L);
                    }
                }
                CharSequence charSequence2 = hVar.f;
                if (charSequence2 != null) {
                    maskedEditText.setFloatingLabelText(charSequence2);
                }
                v01.b bVar = hVar.f284462g;
                if (bVar != null) {
                    hx7.b.e(maskedEditText, bVar);
                }
                CharSequence charSequence3 = hVar.f284463h;
                if (charSequence3 != null) {
                    maskedEditText.setHint(charSequence3);
                }
                Integer num3 = hVar.i;
                if (num3 != null) {
                    maskedEditText.setInputType(num3.intValue());
                }
                if (num != null) {
                    maskedEditText.setHintTextColor(ContextCompat.getColor(holder.itemView.getContext(), num.intValue()));
                }
                Boolean bool3 = hVar.k;
                if (bool3 != null) {
                    k.e(progressBar, bool3.booleanValue());
                }
                Boolean bool4 = hVar.f284465l;
                if (bool4 != null) {
                    appCompatRadioButton.setChecked(bool4.booleanValue());
                }
                maskedEditText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                maskedEditText.setOnTouchListener(null);
                Boolean bool5 = hVar.f284467n;
                if (bool5 != null) {
                    maskedEditText.setHideUnderline(bool5.booleanValue());
                }
                Boolean bool6 = hVar.f284466m;
                if (bool6 != null) {
                    maskedEditText.setInputType(bool6.booleanValue() ? maskedEditText.getInputType() | 524288 : maskedEditText.getInputType() & i3);
                }
            }
            i2 = 0;
        }
        data.getClass();
        String[] strArr = (String[]) f0.f322471a.toArray(new String[i2]);
        if (strArr.length == 0) {
            maskedEditText.setImportantForAutofill(i2);
        } else {
            maskedEditText.setImportantForAutofill(1);
            maskedEditText.setAutofillHints((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextDelegate(int i) {
        int i2;
        g layout = g.DEFAULT;
        Intrinsics.checkNotNullParameter(layout, "layout");
        int i3 = uyl.k.f284469a[layout.ordinal()];
        if (i3 == 1) {
            i2 = R$layout.delegate_edit_text;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$layout.delegate_edit_text_small;
        }
        super(i2, new n(layout, 24));
        this.f107164c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
        this.f107165g = new HashMap();
    }
}
