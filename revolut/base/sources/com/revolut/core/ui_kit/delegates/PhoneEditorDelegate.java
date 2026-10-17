package com.revolut.core.ui_kit.delegates;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.PhoneInputTextView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ix;
import ip0.o00;
import ip0.p00;
import ip0.tz;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0006\u0002\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhoneEditorDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/ka;", "Lip0/p00;", "<init>", "()V", "a", "PhoneData", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneEditorDelegate extends BaseRecyclerViewDelegate<ka, p00> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52894c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PhoneEditorDelegate$PhoneData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PhoneData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52896b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneData(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneData[i];
            }
        }

        public PhoneData(String listId, String phone) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.f52895a = listId;
            this.f52896b = phone;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhoneData)) {
                return false;
            }
            PhoneData phoneData = (PhoneData) obj2;
            return Intrinsics.f(this.f52895a, phoneData.f52895a) && Intrinsics.f(this.f52896b, phoneData.f52896b);
        }

        public final int hashCode() {
            return this.f52896b.hashCode() + (this.f52895a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f52895a);
            dest.writeString(this.f52896b);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pair f52898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f52899c;
        public final Clause d;
        public final Clause e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f52900g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Boolean f52901h;

        public a() {
            this(null, null, null, null, null, null, null, null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f52897a, aVar.f52897a) && Intrinsics.f(this.f52898b, aVar.f52898b) && Intrinsics.f(this.f52899c, aVar.f52899c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f52900g, aVar.f52900g) && Intrinsics.f(this.f52901h, aVar.f52901h);
        }

        public final int hashCode() {
            String str = this.f52897a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Pair pair = this.f52898b;
            int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
            Clause clause = this.f52899c;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.e;
            int iHashCode5 = (iHashCode4 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Clause clause4 = this.f;
            int iHashCode6 = (iHashCode5 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
            Boolean bool = this.f52900g;
            int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f52901h;
            return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public a(String str, Pair pair, Clause clause, Clause clause2, Clause clause3, Clause clause4, Boolean bool, Boolean bool2) {
            this.f52897a = str;
            this.f52898b = pair;
            this.f52899c = clause;
            this.d = clause2;
            this.e = clause3;
            this.f = clause4;
            this.f52900g = bool;
            this.f52901h = bool2;
        }
    }

    public PhoneEditorDelegate() {
        super(R$layout.internal_delegate_phone_editor, new tz(6));
        this.f52894c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new p00(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(p00 holder, ka data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        PhoneInputTextView phoneInputTextView = holder.f;
        if (!payloads.isEmpty()) {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.PhoneEditorDelegate.Payload");
                a aVar = (a) obj2;
                Clause clause = aVar.e;
                if (clause != null) {
                    phoneInputTextView.setError(clause);
                }
                String str = aVar.f52897a;
                if (str != null) {
                    phoneInputTextView.setPhoneNumber(str);
                }
                Clause clause2 = aVar.f52899c;
                if (clause2 != null) {
                    phoneInputTextView.setHintPhone(clause2);
                }
                Clause clause3 = aVar.d;
                if (clause3 != null) {
                    phoneInputTextView.setHintCode(clause3);
                }
                Clause clause4 = aVar.f;
                if (clause4 != null) {
                    phoneInputTextView.setPlaceholder(clause4);
                }
                Pair pair = aVar.f52898b;
                if (pair != null) {
                    int i2 = ((fj0.b) pair.f186385a).f135518a;
                    phoneInputTextView.setPhoneCountryCode(hx7.a.J(i2), (wi0.b) pair.f186386b);
                }
                Boolean bool = aVar.f52900g;
                if (bool != null && bool.booleanValue()) {
                    phoneInputTextView.g();
                }
                Boolean bool2 = aVar.f52901h;
                if (bool2 != null) {
                    phoneInputTextView.setCountryCodeInputEnabled(bool2.booleanValue());
                }
            }
            return;
        }
        Pair pair2 = data.f54378c;
        int i3 = ((fj0.b) pair2.f186385a).f135518a;
        phoneInputTextView.setPhoneCountryCode(hx7.a.J(i3), (wi0.b) pair2.f186386b);
        Clause clause5 = data.e;
        if (clause5 != null) {
            phoneInputTextView.setError(clause5);
        }
        Clause clause6 = data.d;
        if (clause6 != null) {
            phoneInputTextView.setHintPhone(clause6);
        }
        String str2 = data.f54377b;
        if (str2 != null) {
            phoneInputTextView.setPhoneNumber(str2);
        }
        Clause clause7 = data.f;
        if (clause7 != null) {
            phoneInputTextView.setPlaceholder(clause7);
        }
        if (data.f54379g) {
            phoneInputTextView.g();
        }
        phoneInputTextView.setCountryCodeInputEnabled(data.f54380h);
        efm.r map = phoneInputTextView.e().map(new ix(18, new o00(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52894c.a(map, holder);
        efm.r map2 = phoneInputTextView.d().map(new ix(19, new ip0.za(11)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = phoneInputTextView.d.map(new mx0.s2(new mul.k(27), 25));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r map4 = map3.map(new ix(20, new o00(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.e.a(map4, holder);
        this.f.a(phoneInputTextView.f(), holder);
    }
}
