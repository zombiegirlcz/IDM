package com.revolut.feature.slot_manager.api.model;

import akd.s;
import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/slot_manager/api/model/SlotContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_slot_manager_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlotContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SlotContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f87254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f87255b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s sVarValueOf = s.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new SlotContext(sVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SlotContext[i];
        }
    }

    public SlotContext(s screen, Set targetIds) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        this.f87254a = screen;
        this.f87255b = targetIds;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final s getF87254a() {
        return this.f87254a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Set getF87255b() {
        return this.f87255b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SlotContext)) {
            return false;
        }
        SlotContext slotContext = (SlotContext) obj2;
        return this.f87254a == slotContext.f87254a && Intrinsics.f(this.f87255b, slotContext.f87255b);
    }

    public final int hashCode() {
        return this.f87255b.hashCode() + (this.f87254a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87254a.name());
        Iterator itV = n.v(this.f87255b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
    }

    public SlotContext(s sVar) {
        this(sVar, h0.f322473a);
    }
}
