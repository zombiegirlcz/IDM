package ubi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f278900c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f278901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od0.i f278902b;

    static {
        Data data = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        f278900c = new f(data, od0.i.f224256b);
    }

    public f(Data data, od0.i chosenOccupation) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(chosenOccupation, "chosenOccupation");
        this.f278901a = data;
        this.f278902b = chosenOccupation;
    }

    public static f a(f fVar, Data data, od0.i chosenOccupation, int i) {
        if ((i & 1) != 0) {
            data = fVar.f278901a;
        }
        if ((i & 2) != 0) {
            chosenOccupation = fVar.f278902b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(chosenOccupation, "chosenOccupation");
        return new f(data, chosenOccupation);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f278901a, fVar.f278901a) && Intrinsics.f(this.f278902b, fVar.f278902b);
    }

    public final int hashCode() {
        return this.f278902b.hashCode() + (this.f278901a.hashCode() * 31);
    }
}
