package ulm;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements wlm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wlm.h f281092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.q0 f281093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f281094c;
    public boolean d;
    public final /* synthetic */ Cache e;

    public j(Cache cache, wlm.h editor) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        this.e = cache;
        this.f281092a = editor;
        mmm.q0 q0VarD = editor.d(1);
        this.f281093b = q0VarD;
        this.f281094c = new i(cache, this, q0VarD);
    }

    public final void a() {
        Cache cache = this.e;
        synchronized (cache) {
            if (this.d) {
                return;
            }
            this.d = true;
            cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount() + 1);
            vlm.h.f(this.f281093b);
            try {
                this.f281092a.a();
            } catch (IOException unused) {
            }
        }
    }
}
