package bz9;

import bv4.h;
import com.revolut.feature.payments.send_from_clipboard.api.SendFromClipboardApi$Toggles$TransferFromClipboard;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends ry9.d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zy9.d f19942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f19943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f19944n;
    public final b o;

    public e(zy9.d sendFromClipboardInteractor, Set handlers, gte.a featureToggleInteractor, b clipboardErrorDialogMapper) {
        Intrinsics.checkNotNullParameter(sendFromClipboardInteractor, "sendFromClipboardInteractor");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(clipboardErrorDialogMapper, "clipboardErrorDialogMapper");
        this.f19942l = sendFromClipboardInteractor;
        this.f19943m = handlers;
        this.f19944n = featureToggleInteractor;
        this.o = clipboardErrorDialogMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(bz9.e r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof bz9.d
            if (r0 == 0) goto L16
            r0 = r5
            bz9.d r0 = (bz9.d) r0
            int r1 = r0.f19941w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19941w = r1
            goto L1b
        L16:
            bz9.d r0 = new bz9.d
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f19941w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L4d
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            zy9.d r5 = r4.f19942l
            r0.f19941w = r3
            zy9.h r5 = (zy9.h) r5
            c70.a r2 = r5.f326397b
            java.lang.String r2 = r2.d()
            if (r2 != 0) goto L46
            zy9.b$a r5 = zy9.b.a.f326390a
            goto L4a
        L46:
            java.lang.Object r5 = r5.b(r2, r0)
        L4a:
            if (r5 != r1) goto L4d
            return r1
        L4d:
            zy9.b r5 = (zy9.b) r5
            boolean r0 = r5 instanceof zy9.b.a
            r1 = 0
            if (r0 == 0) goto L6e
            bz9.b r5 = r4.o
            r5.getClass()
            nii.y0 r5 = bz9.b.a()
            kotlinx.coroutines.flow.Flow r5 = r4.L2(r5)
            akl.o r0 = new akl.o
            r2 = 2
            r3 = 17
            r0.<init>(r2, r3, r1)
            r2 = 3
            yji.n.j2(r4, r5, r1, r0, r2)
            goto L95
        L6e:
            boolean r0 = r5 instanceof zy9.c
            if (r0 == 0) goto L7a
            zy9.c r5 = (zy9.c) r5
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType r5 = r5.f326391a
            r4.c3(r5)
            goto L95
        L7a:
            boolean r0 = r5 instanceof zy9.a
            if (r0 == 0) goto L98
            zy9.a r5 = (zy9.a) r5
            sy9.a r0 = new sy9.a
            com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardRecognitionResult r5 = r5.f326389a
            r0.<init>(r5)
            com.revolut.kompot.navigable.vc.ViewController r5 = r4.o2(r0)
            bq7.j r0 = new bq7.j
            r2 = 29
            r0.<init>(r4, r2)
            yji.n.P2(r4, r5, r1, r0, r3)
        L95:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L98:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bz9.e.b3(bz9.e, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        Iterator it8 = this.f19943m.iterator();
        while (it8.hasNext()) {
            w2((ry9.b) it8.next(), null);
        }
    }

    @Override // yji.n
    public final void E2() {
        Iterator it8 = this.f19943m.iterator();
        while (it8.hasNext()) {
            m2((ry9.b) it8.next());
        }
    }

    @Override // ry9.d
    public final void Z2() {
        if (this.f19944n.a(SendFromClipboardApi$Toggles$TransferFromClipboard.f79687c)) {
            return;
        }
        T2(new h(this, null, 3), new yi5.b(27));
    }

    public final void c3(SendFromClipboardType sendFromClipboardType) {
        Object next;
        Iterator it8 = this.f19943m.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((ry9.b) next).Z2(sendFromClipboardType)) {
                    break;
                }
            }
        }
        if (((ry9.b) next) == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.INFO, "SendFromClipboardModelExtensionImpl", "No extension can handle: " + sendFromClipboardType, null, null, 16);
        }
    }
}
