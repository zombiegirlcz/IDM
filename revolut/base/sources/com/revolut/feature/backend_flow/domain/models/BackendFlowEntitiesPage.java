package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowEntitiesPage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowEntitiesPage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendFlowEntitiesPage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f63269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f63271c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BackendFlowEntity.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BackendFlowEntitiesPage(j2, arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowEntitiesPage[i];
        }
    }

    public BackendFlowEntitiesPage(long j2, List entities, boolean z) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        this.f63269a = z;
        this.f63270b = j2;
        this.f63271c = entities;
    }

    public static BackendFlowEntitiesPage a(BackendFlowEntitiesPage backendFlowEntitiesPage, List entities) {
        boolean z = backendFlowEntitiesPage.f63269a;
        long j2 = backendFlowEntitiesPage.f63270b;
        backendFlowEntitiesPage.getClass();
        Intrinsics.checkNotNullParameter(entities, "entities");
        return new BackendFlowEntitiesPage(j2, entities, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlowEntitiesPage)) {
            return false;
        }
        BackendFlowEntitiesPage backendFlowEntitiesPage = (BackendFlowEntitiesPage) obj2;
        return this.f63269a == backendFlowEntitiesPage.f63269a && this.f63270b == backendFlowEntitiesPage.f63270b && Intrinsics.f(this.f63271c, backendFlowEntitiesPage.f63271c);
    }

    public final int hashCode() {
        return this.f63271c.hashCode() + a0.d.c(Boolean.hashCode(this.f63269a) * 31, 31, this.f63270b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f63269a ? 1 : 0);
        dest.writeLong(this.f63270b);
        Iterator itV = p.a.v(this.f63271c, dest);
        while (itV.hasNext()) {
            ((BackendFlowEntity) itV.next()).writeToParcel(dest, i);
        }
    }
}
