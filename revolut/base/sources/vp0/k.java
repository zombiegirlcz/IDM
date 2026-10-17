package vp0;

import android.content.Context;
import android.view.TextureView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends TextureView {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final js0.b f291035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq0.h f291036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f291037c;
    public final ArrayList d;
    public boolean e;

    public k(Context context, js0.b bVar) {
        super(context);
        this.f291035a = bVar;
        this.f291036b = new jq0.h(this, 3);
        this.d = new ArrayList();
        setOpaque(false);
        setSurfaceTextureListener(new hbm.e(this, 2));
    }

    public final boolean getDestroyed() {
        return this.e;
    }
}
