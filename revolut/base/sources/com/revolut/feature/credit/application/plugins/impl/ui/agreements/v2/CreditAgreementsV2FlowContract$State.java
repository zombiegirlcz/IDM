package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.kompot.navigable.flow.FlowState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/v2/CreditAgreementsV2FlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Lcli/j;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAgreementsV2FlowContract$State implements FlowState, j {

    @NotNull
    public static final Parcelable.Creator<CreditAgreementsV2FlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f67011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f67012b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
            }
            return new CreditAgreementsV2FlowContract$State(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAgreementsV2FlowContract$State[i];
        }
    }

    public CreditAgreementsV2FlowContract$State() {
        this(0);
    }

    public static CreditAgreementsV2FlowContract$State a(CreditAgreementsV2FlowContract$State creditAgreementsV2FlowContract$State, List documents, Map documentIdsToSelectedClauses, int i) {
        if ((i & 1) != 0) {
            documents = creditAgreementsV2FlowContract$State.f67011a;
        }
        if ((i & 2) != 0) {
            documentIdsToSelectedClauses = creditAgreementsV2FlowContract$State.f67012b;
        }
        creditAgreementsV2FlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(documentIdsToSelectedClauses, "documentIdsToSelectedClauses");
        return new CreditAgreementsV2FlowContract$State(documents, documentIdsToSelectedClauses);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAgreementsV2FlowContract$State)) {
            return false;
        }
        CreditAgreementsV2FlowContract$State creditAgreementsV2FlowContract$State = (CreditAgreementsV2FlowContract$State) obj2;
        return Intrinsics.f(this.f67011a, creditAgreementsV2FlowContract$State.f67011a) && Intrinsics.f(this.f67012b, creditAgreementsV2FlowContract$State.f67012b);
    }

    public final int hashCode() {
        return this.f67012b.hashCode() + (this.f67011a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f67011a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itZ = j6.a.z(this.f67012b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeStringList((List) entry.getValue());
        }
    }

    public CreditAgreementsV2FlowContract$State(List documents, Map documentIdsToSelectedClauses) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(documentIdsToSelectedClauses, "documentIdsToSelectedClauses");
        this.f67011a = documents;
        this.f67012b = documentIdsToSelectedClauses;
    }

    public CreditAgreementsV2FlowContract$State(int i) {
        this(f0.f322471a, r0.g());
    }
}
