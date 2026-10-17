package jem;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import y0m.g;
import y0m.h;

/* JADX INFO: loaded from: classes23.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f173621b;

    public b(int i) {
        this.f173620a = i;
        switch (i) {
            case 2:
                this.f173621b = new HashMap();
                break;
            default:
                this.f173621b = new pem.a();
                break;
        }
    }

    public g a(String stateIdentifier) {
        Intrinsics.checkNotNullParameter(stateIdentifier, "stateIdentifier");
        h hVarB = b(stateIdentifier);
        if (hVarB == null) {
            return null;
        }
        return hVarB.a();
    }

    public synchronized h b(String stateIdentifier) {
        Intrinsics.checkNotNullParameter(stateIdentifier, "stateIdentifier");
        return (h) ((HashMap) this.f173621b).get(stateIdentifier);
    }

    public void c(glm.a definition) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        a.a(((pem.a) this.f173621b).a(definition));
    }

    public String toString() {
        switch (this.f173620a) {
            case 1:
                return "Phase('" + ((String) this.f173621b) + "')";
            default:
                return super.toString();
        }
    }

    public b(String name) {
        this.f173620a = 1;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f173621b = name;
    }
}
