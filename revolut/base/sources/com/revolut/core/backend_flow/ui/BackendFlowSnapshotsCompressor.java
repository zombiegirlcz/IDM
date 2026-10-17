package com.revolut.core.backend_flow.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes19.dex */
public final class BackendFlowSnapshotsCompressor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Diff;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Diff implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Diff> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BackendFlow f51313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedHashSet f51314c;
        public final Set d;
        public final LinkedHashMap e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                BackendFlow backendFlow = (BackendFlow) parcel.readParcelable(Diff.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(Diff.class, parcel, linkedHashSet, iE, 1);
                }
                int i2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = o.a(parcel, linkedHashSet2, iA, 1);
                }
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Diff.class.getClassLoader()));
                }
                return new Diff(string, backendFlow, linkedHashSet, linkedHashSet2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Diff[i];
            }
        }

        public Diff(String str, BackendFlow emptyBackendFlow, LinkedHashSet added, Set removed, LinkedHashMap modified) {
            Intrinsics.checkNotNullParameter(emptyBackendFlow, "emptyBackendFlow");
            Intrinsics.checkNotNullParameter(added, "added");
            Intrinsics.checkNotNullParameter(removed, "removed");
            Intrinsics.checkNotNullParameter(modified, "modified");
            this.f51312a = str;
            this.f51313b = emptyBackendFlow;
            this.f51314c = added;
            this.d = removed;
            this.e = modified;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Diff)) {
                return false;
            }
            Diff diff = (Diff) obj2;
            return Intrinsics.f(this.f51312a, diff.f51312a) && Intrinsics.f(this.f51313b, diff.f51313b) && this.f51314c.equals(diff.f51314c) && Intrinsics.f(this.d, diff.d) && this.e.equals(diff.e);
        }

        public final int hashCode() {
            String str = this.f51312a;
            return this.e.hashCode() + p.a.f((this.f51314c.hashCode() + ((this.f51313b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f51312a);
            dest.writeParcelable(this.f51313b, i);
            LinkedHashSet linkedHashSet = this.f51314c;
            dest.writeInt(linkedHashSet.size());
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                dest.writeParcelable((Parcelable) it8.next(), i);
            }
            Iterator itV = n.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString((String) itV.next());
            }
            LinkedHashMap linkedHashMap = this.e;
            dest.writeInt(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result;", "Landroid/os/Parcelable;", "Compressed", "Empty", "Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result$Compressed;", "Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result$Empty;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Result extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result$Compressed;", "Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result;", "", "toString", "()Ljava/lang/String;", "SnapshotDiff", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Compressed implements Result {

            @NotNull
            public static final Parcelable.Creator<Compressed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f51315a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BackendFlow f51316b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f51317c;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result$Compressed$SnapshotDiff;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SnapshotDiff implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<SnapshotDiff> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f51318a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Diff f51319b;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SnapshotDiff(parcel.readString(), Diff.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SnapshotDiff[i];
                    }
                }

                public SnapshotDiff(String snapshotId, Diff diff) {
                    Intrinsics.checkNotNullParameter(snapshotId, "snapshotId");
                    Intrinsics.checkNotNullParameter(diff, "diff");
                    this.f51318a = snapshotId;
                    this.f51319b = diff;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof SnapshotDiff)) {
                        return false;
                    }
                    SnapshotDiff snapshotDiff = (SnapshotDiff) obj2;
                    return Intrinsics.f(this.f51318a, snapshotDiff.f51318a) && Intrinsics.f(this.f51319b, snapshotDiff.f51319b);
                }

                public final int hashCode() {
                    return this.f51319b.hashCode() + (this.f51318a.hashCode() * 31);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f51318a);
                    this.f51319b.writeToParcel(dest, i);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    BackendFlow backendFlow = (BackendFlow) parcel.readParcelable(Compressed.class.getClassLoader());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(SnapshotDiff.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Compressed(string, backendFlow, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Compressed[i];
                }
            }

            public Compressed(String firstSnapshotId, BackendFlow original, ArrayList diffs) {
                Intrinsics.checkNotNullParameter(firstSnapshotId, "firstSnapshotId");
                Intrinsics.checkNotNullParameter(original, "original");
                Intrinsics.checkNotNullParameter(diffs, "diffs");
                this.f51315a = firstSnapshotId;
                this.f51316b = original;
                this.f51317c = diffs;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Compressed)) {
                    return false;
                }
                Compressed compressed = (Compressed) obj2;
                return Intrinsics.f(this.f51315a, compressed.f51315a) && Intrinsics.f(this.f51316b, compressed.f51316b) && this.f51317c.equals(compressed.f51317c);
            }

            public final int hashCode() {
                return this.f51317c.hashCode() + ((this.f51316b.hashCode() + (this.f51315a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f51315a);
                dest.writeParcelable(this.f51316b, i);
                Iterator itY = j6.a.y(this.f51317c, dest);
                while (itY.hasNext()) {
                    ((SnapshotDiff) itY.next()).writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result$Empty;", "Lcom/revolut/core/backend_flow/ui/BackendFlowSnapshotsCompressor$Result;", "<init>", "()V", "core_backend_flow_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Empty implements Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Empty f51320a = new Empty();

            @NotNull
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Empty.f51320a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Empty[i];
                }
            }

            private Empty() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }
}
