package com.revolut.feature.credit.core.ui.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/core/ui/bottom_sheet/BottomSheet$InputData$Action", "", "", "toString", "()Ljava/lang/String;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomSheet$InputData$Action implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BottomSheet$InputData$Action> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f69826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f69827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GlyphImage f69828c;
    public final List d;
    public final List e;
    public final BottomSheet.ActionItem f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BottomSheet.ActionBlock f69829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f69830h;
    public final AnalyticsContext i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", BottomSheet$InputData$Action.class);
            Clause clause2 = (Clause) parcel.readParcelable(BottomSheet$InputData$Action.class.getClassLoader());
            GlyphImage glyphImage = (GlyphImage) parcel.readParcelable(BottomSheet$InputData$Action.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BottomSheet.ItemSection.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(BottomSheet$InputData$Action.class, parcel, arrayList2, iE, 1);
            }
            return new BottomSheet$InputData$Action(clause, clause2, glyphImage, arrayList, arrayList2, parcel.readInt() == 0 ? null : BottomSheet.ActionItem.CREATOR.createFromParcel(parcel), (BottomSheet.ActionBlock) parcel.readParcelable(BottomSheet$InputData$Action.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(BottomSheet$InputData$Action.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(BottomSheet$InputData$Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BottomSheet$InputData$Action[i];
        }
    }

    public BottomSheet$InputData$Action(Clause title, Clause clause, GlyphImage glyphImage, List sections, List itemsSection, BottomSheet.ActionItem actionItem, BottomSheet.ActionBlock actionBlock, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(itemsSection, "itemsSection");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f69826a = title;
        this.f69827b = clause;
        this.f69828c = glyphImage;
        this.d = sections;
        this.e = itemsSection;
        this.f = actionItem;
        this.f69829g = actionBlock;
        this.f69830h = analyticsProduct;
        this.i = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BottomSheet$InputData$Action)) {
            return false;
        }
        BottomSheet$InputData$Action bottomSheet$InputData$Action = (BottomSheet$InputData$Action) obj2;
        return Intrinsics.f(this.f69826a, bottomSheet$InputData$Action.f69826a) && Intrinsics.f(this.f69827b, bottomSheet$InputData$Action.f69827b) && Intrinsics.f(this.f69828c, bottomSheet$InputData$Action.f69828c) && Intrinsics.f(this.d, bottomSheet$InputData$Action.d) && Intrinsics.f(this.e, bottomSheet$InputData$Action.e) && Intrinsics.f(this.f, bottomSheet$InputData$Action.f) && Intrinsics.f(this.f69829g, bottomSheet$InputData$Action.f69829g) && Intrinsics.f(this.f69830h, bottomSheet$InputData$Action.f69830h) && Intrinsics.f(this.i, bottomSheet$InputData$Action.i);
    }

    public final int hashCode() {
        int iHashCode = this.f69826a.hashCode() * 31;
        Clause clause = this.f69827b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        GlyphImage glyphImage = this.f69828c;
        int iD = p.a.d(p.a.d((iHashCode2 + (glyphImage == null ? 0 : glyphImage.hashCode())) * 31, 31, this.d), 31, this.e);
        BottomSheet.ActionItem actionItem = this.f;
        int iHashCode3 = (iD + (actionItem == null ? 0 : actionItem.hashCode())) * 31;
        BottomSheet.ActionBlock actionBlock = this.f69829g;
        int iA = l.a((iHashCode3 + (actionBlock == null ? 0 : actionBlock.hashCode())) * 31, 31, this.f69830h);
        AnalyticsContext analyticsContext = this.i;
        return iA + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69826a, i);
        dest.writeParcelable(this.f69827b, i);
        dest.writeParcelable(this.f69828c, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((BottomSheet.ItemSection) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        BottomSheet.ActionItem actionItem = this.f;
        if (actionItem == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            actionItem.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f69829g, i);
        dest.writeParcelable(this.f69830h, i);
        dest.writeParcelable(this.i, i);
    }
}
