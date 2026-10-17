package qc7;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import f28.b0;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vf0.k;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f244583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f244584c;
    public final /* synthetic */ String d;
    public final /* synthetic */ dsh.e e;

    public /* synthetic */ b(e eVar, String str, String str2, dsh.e eVar2, int i) {
        this.f244582a = i;
        this.f244583b = eVar;
        this.f244584c = str;
        this.d = str2;
        this.e = eVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f244582a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f244583b.d(this.f244584c, this.d, this.e);
            case 1:
                k kVar = (k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                Data data = (Data) kVar.f288454a;
                final yt8.c cVar = (yt8.c) kVar.f288455b;
                final Boolean bool = (Boolean) kVar.f288456c;
                final Map map = (Map) kVar.d;
                final boolean zBooleanValue = ((Boolean) kVar.e).booleanValue();
                final e eVar = this.f244583b;
                final String str = this.f244584c;
                final int i = 1;
                return (BaseDraggableWidgetDelegate.Model) iii.c.f(data, new b(eVar, str, this.d, this.e, 0), new b0(eVar, str, 15), new Function3() { // from class: qc7.a
                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model, still in use, count: 2, list:
                          (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) from 0x0148: MOVE (r17v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) = (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model)
                          (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) from 0x013d: MOVE (r17v5 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) = (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                        */
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
                        /*
                            Method dump skipped, instruction units count: 986
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: qc7.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            case 2:
                vf0.g gVar = (vf0.g) obj2;
                Intrinsics.checkNotNullParameter(gVar, "<destruct>");
                Data data2 = (Data) gVar.f288428a;
                final yt8.c cVar2 = (yt8.c) gVar.f288429b;
                final Boolean bool2 = (Boolean) gVar.f288430c;
                Data data3 = (Data) gVar.d;
                final Map map2 = (Map) gVar.e;
                final boolean zBooleanValue2 = ((Boolean) gVar.f).booleanValue();
                Data dataV = t1.v(data2, data3, (Data) gVar.f288431g, (Data) gVar.f288432h);
                final e eVar2 = this.f244583b;
                final String str2 = this.f244584c;
                final int i2 = 0;
                return (BaseDraggableWidgetDelegate.Model) iii.c.f(dataV, new b(eVar2, str2, this.d, this.e, 3), new b0(eVar2, str2, 14), new Function3() { // from class: qc7.a
                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model, still in use, count: 2, list:
                          (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) from 0x0148: MOVE (r17v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) = (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model)
                          (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) from 0x013d: MOVE (r17v5 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model) = (r9v1 com.revolut.core.ui_kit.delegates.ReferralContactDelegate$Model)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
                        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                        */
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
                        /*
                            Method dump skipped, instruction units count: 986
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: qc7.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            default:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f244583b.d(this.f244584c, this.d, this.e);
        }
    }
}
