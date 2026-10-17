package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import dj0.d;
import h30.l;
import ip0.v7;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import np8.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChallengesEditContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<ChallengesEditContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp8.b f77360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f77361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77362c;
    public final String d;
    public final d e;
    public final ZonedDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dp8.d f77363g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallengesEditContract$State((dp8.b) parcel.readSerializable(), c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable(), dp8.d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChallengesEditContract$State[i];
        }
    }

    public ChallengesEditContract$State(dp8.b bVar, c mode, String name, String description, d reward, ZonedDateTime startDate, dp8.d frequency) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f77360a = bVar;
        this.f77361b = mode;
        this.f77362c = name;
        this.d = description;
        this.e = reward;
        this.f = startDate;
        this.f77363g = frequency;
    }

    public static ChallengesEditContract$State a(ChallengesEditContract$State challengesEditContract$State, String str, String str2, d dVar, ZonedDateTime zonedDateTime, dp8.d dVar2, int i) {
        dp8.b bVar = challengesEditContract$State.f77360a;
        c mode = challengesEditContract$State.f77361b;
        if ((i & 4) != 0) {
            str = challengesEditContract$State.f77362c;
        }
        String name = str;
        if ((i & 8) != 0) {
            str2 = challengesEditContract$State.d;
        }
        String description = str2;
        if ((i & 16) != 0) {
            dVar = challengesEditContract$State.e;
        }
        d reward = dVar;
        if ((i & 32) != 0) {
            zonedDateTime = challengesEditContract$State.f;
        }
        ZonedDateTime startDate = zonedDateTime;
        if ((i & 64) != 0) {
            dVar2 = challengesEditContract$State.f77363g;
        }
        dp8.d frequency = dVar2;
        challengesEditContract$State.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new ChallengesEditContract$State(bVar, mode, name, description, reward, startDate, frequency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChallengesEditContract$State)) {
            return false;
        }
        ChallengesEditContract$State challengesEditContract$State = (ChallengesEditContract$State) obj2;
        return Intrinsics.f(this.f77360a, challengesEditContract$State.f77360a) && this.f77361b == challengesEditContract$State.f77361b && Intrinsics.f(this.f77362c, challengesEditContract$State.f77362c) && Intrinsics.f(this.d, challengesEditContract$State.d) && Intrinsics.f(this.e, challengesEditContract$State.e) && Intrinsics.f(this.f, challengesEditContract$State.f) && this.f77363g == challengesEditContract$State.f77363g;
    }

    public final int hashCode() {
        dp8.b bVar = this.f77360a;
        return this.f77363g.hashCode() + l.h(this.f, v7.c(p.a.c(p.a.c((this.f77361b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31, 31, this.f77362c), 31, this.d), 31, this.e), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77360a);
        dest.writeString(this.f77361b.name());
        dest.writeString(this.f77362c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f77363g.name());
    }
}
