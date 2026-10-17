package oc0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f224039c;

    public j(String formId, String itemId, Map parameters) {
        Intrinsics.checkNotNullParameter(formId, "formId");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f224037a = formId;
        this.f224038b = itemId;
        this.f224039c = parameters;
    }

    public final String a() {
        StringBuilder sbM = v0.a.m("EntitiesSummaryParams(formId=", this.f224037a, ", itemId=", this.f224038b, ", parameters=");
        sbM.append(this.f224039c);
        sbM.append(")");
        return sbM.toString();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f224037a, jVar.f224037a) && Intrinsics.f(this.f224038b, jVar.f224038b) && Intrinsics.f(this.f224039c, jVar.f224039c);
    }

    public final int hashCode() {
        return this.f224039c.hashCode() + p.a.c(this.f224037a.hashCode() * 31, 31, this.f224038b);
    }
}
