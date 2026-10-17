package au0;

import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9437c;

    public /* synthetic */ x5(int i, Object obj2, boolean z, Object obj3) {
        this.f9435a = i;
        this.f9437c = obj2;
        this.f9436b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0231 A[Catch: all -> 0x022e, TryCatch #6 {all -> 0x022e, blocks: (B:80:0x01d3, B:101:0x0265, B:83:0x01e1, B:85:0x0201, B:87:0x020d, B:92:0x021b, B:96:0x0231, B:100:0x0258, B:99:0x0240), top: B:320:0x01d3 }] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [ip0.ah0] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 2110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.x5.run():void");
    }

    public /* synthetic */ x5(View view, Object obj2, Object obj3, int i) {
        this.f9435a = i;
        this.f9436b = obj2;
        this.f9437c = obj3;
    }

    public /* synthetic */ x5(Object obj2, Object obj3, int i) {
        this.f9435a = i;
        this.f9436b = obj2;
        this.f9437c = obj3;
    }

    public x5(ListenableFuture futureToObserve, skm.l continuation) {
        this.f9435a = 1;
        Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f9436b = futureToObserve;
        this.f9437c = continuation;
    }

    public x5(WallpaperView wallpaperView) {
        this.f9435a = 0;
        this.f9437c = wallpaperView;
    }
}
