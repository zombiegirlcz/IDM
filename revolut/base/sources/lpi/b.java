package lpi;

import android.content.Context;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends fsi.c implements e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fsi.b f199137n = new fsi.b("BOTTOM_DIALOG_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f199138h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yyl.c f199139j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f199140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f199141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, f imageDisplayer) {
        super(f199137n);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f199138h = context;
        this.i = imageDisplayer;
        this.f199140l = p.a.h("toSerialized(...)");
        this.f199141m = p.a.D("toSerialized(...)");
    }
}
