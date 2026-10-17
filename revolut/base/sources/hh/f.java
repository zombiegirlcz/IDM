package hh;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcv;
import com.google.android.gms.internal.mlkit_vision_barcode.zztx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzui;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ch.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.h f152203a;

    public f(ch.h hVar) {
        this.f152203a = hVar;
    }

    @Override // ch.e
    public final Object create(Object obj2) {
        eh.a aVar = (eh.a) obj2;
        ch.h hVar = this.f152203a;
        Context contextB = hVar.b();
        zztx zztxVarZzb = zzui.zzb(true != b.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning");
        zzcv zzcvVar = l.f152213h;
        return new i(hVar, aVar, (DynamiteModule.getLocalVersion(contextB, "com.google.mlkit.dynamite.barcode") <= 0 && GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) < 204500000) ? new m(contextB, aVar, zztxVarZzb) : new l(contextB, aVar, zztxVarZzb), zztxVarZzb);
    }
}
