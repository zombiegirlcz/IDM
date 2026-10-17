package com.revolut.shared.feature.user_declarations.api.flows.income;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.user_declarations.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sil.c;
import xi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/flows/income/IncomeFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomeFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IncomeFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f105018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f105019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f105020c;
    public final Clause d;
    public final Image e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f105021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f105022h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", IncomeFlowInputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(IncomeFlowInputData.class.getClassLoader());
            Clause clause3 = (Clause) parcel.readParcelable(IncomeFlowInputData.class.getClassLoader());
            Clause clause4 = (Clause) parcel.readParcelable(IncomeFlowInputData.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(IncomeFlowInputData.class.getClassLoader());
            b bVar = (b) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(c.valueOf(parcel.readString()));
            }
            return new IncomeFlowInputData(clause, clause2, clause3, clause4, image, bVar, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IncomeFlowInputData[i];
        }
    }

    public IncomeFlowInputData(Clause title, Clause clause, Clause clause2, Clause buttonClause, Image image, b bVar, boolean z, List frequencies) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(frequencies, "frequencies");
        this.f105018a = title;
        this.f105019b = clause;
        this.f105020c = clause2;
        this.d = buttonClause;
        this.e = image;
        this.f = bVar;
        this.f105021g = z;
        this.f105022h = frequencies;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IncomeFlowInputData)) {
            return false;
        }
        IncomeFlowInputData incomeFlowInputData = (IncomeFlowInputData) obj2;
        return Intrinsics.f(this.f105018a, incomeFlowInputData.f105018a) && Intrinsics.f(this.f105019b, incomeFlowInputData.f105019b) && Intrinsics.f(this.f105020c, incomeFlowInputData.f105020c) && Intrinsics.f(this.d, incomeFlowInputData.d) && Intrinsics.f(this.e, incomeFlowInputData.e) && Intrinsics.f(this.f, incomeFlowInputData.f) && this.f105021g == incomeFlowInputData.f105021g && Intrinsics.f(this.f105022h, incomeFlowInputData.f105022h);
    }

    public final int hashCode() {
        int iHashCode = this.f105018a.hashCode() * 31;
        Clause clause = this.f105019b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f105020c;
        int iA = p.a.a((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.d);
        Image image = this.e;
        int iHashCode3 = (iA + (image == null ? 0 : image.hashCode())) * 31;
        b bVar = this.f;
        return this.f105022h.hashCode() + j6.a.c((iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f105021g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105018a, i);
        dest.writeParcelable(this.f105019b, i);
        dest.writeParcelable(this.f105020c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f105021g ? 1 : 0);
        Iterator itV = p.a.v(this.f105022h, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
    }

    public IncomeFlowInputData(Clause clause, Clause clause2, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ResourceImage resourceImage, b bVar, List list, int i) {
        this(clause, (i & 2) != 0 ? null : clause2, (i & 4) != 0 ? null : textLocalisedClause, (i & 8) != 0 ? new TextLocalisedClause(R$string.common_action_continue, null, null, 14) : textLocalisedClause2, resourceImage, bVar, (i & 64) == 0, list);
    }
}
