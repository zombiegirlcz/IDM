package jq4;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f177450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f177451b;

    public h(Data model, List slots) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(slots, "slots");
        this.f177450a = model;
        this.f177451b = slots;
    }

    public static h a(h hVar, Data model, List slots, int i) {
        if ((i & 1) != 0) {
            model = hVar.f177450a;
        }
        if ((i & 2) != 0) {
            slots = hVar.f177451b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(slots, "slots");
        return new h(model, slots);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f177450a, hVar.f177450a) && Intrinsics.f(this.f177451b, hVar.f177451b);
    }

    public final int hashCode() {
        return this.f177451b.hashCode() + (this.f177450a.hashCode() * 31);
    }
}
