package jfb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public interface j {

    @NotNull
    public static final g Companion = g.f173810a;

    default String a() {
        if (this instanceof i) {
            i iVar = (i) this;
            String string = new JSONObject().put("lat", iVar.f173813a).put("lon", iVar.f173814b).put("horizontalAccuracy", Float.valueOf(10.0f)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        if (!(this instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = new JSONObject().put("error", ((h) this).f173811a.name()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
