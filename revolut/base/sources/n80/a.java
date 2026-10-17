package n80;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f213183c;
    public final String d;
    public final String e;

    public a(String manufacturer, String name, String model, String codename, String deviceName) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.f213181a = manufacturer;
        this.f213182b = name;
        this.f213183c = model;
        this.d = codename;
        this.e = deviceName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213181a, aVar.f213181a) && Intrinsics.f(this.f213182b, aVar.f213182b) && Intrinsics.f(this.f213183c, aVar.f213183c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f213181a.hashCode() * 31, 31, this.f213182b), 31, this.f213183c), 31, this.d);
    }
}
