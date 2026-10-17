package agh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f4826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f4827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f4828c;

    public static final class a {
        private a() {
        }
    }

    public d() {
        this(null, null, null);
    }

    public static d a(d dVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = dVar.f4826a;
        }
        if ((i & 2) != 0) {
            data2 = dVar.f4827b;
        }
        if ((i & 4) != 0) {
            data3 = dVar.f4828c;
        }
        dVar.getClass();
        return new d(data, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f4826a, dVar.f4826a) && Intrinsics.f(this.f4827b, dVar.f4827b) && Intrinsics.f(this.f4828c, dVar.f4828c);
    }

    public final int hashCode() {
        Data data = this.f4826a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f4827b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f4828c;
        return iHashCode2 + (data3 != null ? data3.hashCode() : 0);
    }

    public d(Data data, Data data2, Data data3) {
        this.f4826a = data;
        this.f4827b = data2;
        this.f4828c = data3;
    }
}
