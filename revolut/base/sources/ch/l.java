package ch;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ce.b f24039b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24040a;

    static {
        ce.a aVarB = ce.b.b(l.class);
        aVarB.a(ce.n.c(h.class));
        aVarB.a(ce.n.c(Context.class));
        aVarB.f = new b(2);
        f24039b = aVarB.b();
    }

    public l(Context context) {
        this.f24040a = context;
    }

    public final synchronized String a() {
        String string = this.f24040a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f24040a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
