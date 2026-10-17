package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowWidgetProgression;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Step", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BackendFlowWidgetProgression implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BackendFlowWidgetProgression> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f63291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63292c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowWidgetProgression$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "com/revolut/feature/backend_flow/domain/models/c", "com/revolut/feature/backend_flow/domain/models/a", "com/revolut/feature/backend_flow/domain/models/b", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Step implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Step> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f63295c;
        public final c d;
        public final b e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Action f63296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.revolut.feature.backend_flow.domain.models.a f63297h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/BackendFlowWidgetProgression$Step$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f63298a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Action[i];
                }
            }

            public Action(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f63298a = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Action) && Intrinsics.f(this.f63298a, ((Action) obj2).f63298a);
            }

            public final int hashCode() {
                return this.f63298a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f63298a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Step(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.revolut.feature.backend_flow.domain.models.a.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Step[i];
            }
        }

        public Step(String title, String str, Long l2, c cVar, b bVar, String str2, Action action, com.revolut.feature.backend_flow.domain.models.a aVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f63293a = title;
            this.f63294b = str;
            this.f63295c = l2;
            this.d = cVar;
            this.e = bVar;
            this.f = str2;
            this.f63296g = action;
            this.f63297h = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Step)) {
                return false;
            }
            Step step = (Step) obj2;
            return Intrinsics.f(this.f63293a, step.f63293a) && Intrinsics.f(this.f63294b, step.f63294b) && Intrinsics.f(this.f63295c, step.f63295c) && this.d == step.d && this.e == step.e && Intrinsics.f(this.f, step.f) && Intrinsics.f(this.f63296g, step.f63296g) && this.f63297h == step.f63297h;
        }

        public final int hashCode() {
            int iHashCode = this.f63293a.hashCode() * 31;
            String str = this.f63294b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.f63295c;
            int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
            c cVar = this.d;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.e;
            int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.f63296g;
            int iHashCode7 = (iHashCode6 + (action == null ? 0 : action.f63298a.hashCode())) * 31;
            com.revolut.feature.backend_flow.domain.models.a aVar = this.f63297h;
            return iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63293a);
            dest.writeString(this.f63294b);
            Long l2 = this.f63295c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            c cVar = this.d;
            if (cVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cVar.name());
            }
            b bVar = this.e;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.f);
            Action action = this.f63296g;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
            com.revolut.feature.backend_flow.domain.models.a aVar = this.f63297h;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BackendFlowWidgetProgression(parcel.readInt(), string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackendFlowWidgetProgression[i];
        }
    }

    public BackendFlowWidgetProgression(int i, String headerTitle, ArrayList steps) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f63290a = headerTitle;
        this.f63291b = steps;
        this.f63292c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BackendFlowWidgetProgression)) {
            return false;
        }
        BackendFlowWidgetProgression backendFlowWidgetProgression = (BackendFlowWidgetProgression) obj2;
        return Intrinsics.f(this.f63290a, backendFlowWidgetProgression.f63290a) && this.f63291b.equals(backendFlowWidgetProgression.f63291b) && this.f63292c == backendFlowWidgetProgression.f63292c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63292c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f63291b, this.f63290a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63290a);
        Iterator itY = j6.a.y(this.f63291b, dest);
        while (itY.hasNext()) {
            ((Step) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f63292c);
    }
}
