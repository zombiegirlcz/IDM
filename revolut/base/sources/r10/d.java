package r10;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import au6.c3;
import bn2.j0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.DeviceInfos;
import defpackage.f1;
import dej.q0;
import dfj.c0;
import efm.d0;
import grl.za;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import joh.z;
import k50.i2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.Instant;
import u10.f;
import yhm.m;
import zh9.u0;
import zhm.a0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements ITaskMonitor, s1d.a, ir0.h, oqh.a, xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f250818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f250819b;

    public d(dr3.g creditPromptContentDtoMapper, x04.h documentsUploadConfigDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        Intrinsics.checkNotNullParameter(documentsUploadConfigDtoMapper, "documentsUploadConfigDtoMapper");
        this.f250818a = creditPromptContentDtoMapper;
        this.f250819b = documentsUploadConfigDtoMapper;
    }

    public static hs3.c t0(ot3.c cVar) {
        return new hs3.c(cVar.getTitle(), cVar.getDescription(), cVar.getButtonText(), cVar.getDisclaimer());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r8 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f250818a
            au6.c3 r0 = (au6.c3) r0
            boolean r1 = r9 instanceof et6.o3
            if (r1 == 0) goto L17
            r1 = r9
            et6.o3 r1 = (et6.o3) r1
            int r2 = r1.f129291x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f129291x = r2
            goto L1c
        L17:
            et6.o3 r1 = new et6.o3
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f129291x
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3d
            if (r3 == r6) goto L37
            if (r3 != r5) goto L2f
            yhm.o.b(r9)
            goto L7a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.String r8 = r1.u
            yhm.o.b(r9)
            goto L63
        L3d:
            yhm.o.b(r9)
            r1.u = r8
            r1.f129291x = r6
            r0.getClass()
            ald.l r9 = new ald.l
            r3 = 22
            r9.<init>(r0, r8, r4, r3)
            skm.p0 r3 = skm.p0.f264001a
            elm.f r3 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r3, r9, r1)
            if (r9 != r2) goto L59
            goto L5b
        L59:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L5b:
            if (r9 != r2) goto L5e
            goto L60
        L5e:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L60:
            if (r9 != r2) goto L63
            goto L79
        L63:
            r1.u = r4
            r1.f129291x = r5
            x4l.c r9 = r0.f
            java.lang.Object r8 = r9.d(r8, r6, r1)
            if (r8 != r2) goto L70
            goto L72
        L70:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L72:
            if (r8 != r2) goto L75
            goto L77
        L75:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L77:
            if (r8 != r2) goto L7a
        L79:
            return r2
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.d.B(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r11 == r7) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(java.lang.String r11, java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f250818a
            r3 = r0
            au6.c3 r3 = (au6.c3) r3
            boolean r0 = r13 instanceof et6.p3
            if (r0 == 0) goto L18
            r0 = r13
            et6.p3 r0 = (et6.p3) r0
            int r1 = r0.f129303x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r2
            if (r4 == 0) goto L18
            int r1 = r1 - r2
            r0.f129303x = r1
            goto L1d
        L18:
            et6.p3 r0 = new et6.p3
            r0.<init>(r10, r13)
        L1d:
            java.lang.Object r13 = r0.v
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.f129303x
            r8 = 2
            r9 = 1
            r6 = 0
            if (r1 == 0) goto L3e
            if (r1 == r9) goto L38
            if (r1 != r8) goto L30
            yhm.o.b(r13)
            goto L7e
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            java.lang.String r11 = r0.u
            yhm.o.b(r13)
            goto L67
        L3e:
            yhm.o.b(r13)
            r0.u = r11
            r0.f129303x = r9
            r3.getClass()
            akl.s1 r1 = new akl.s1
            r2 = 13
            r5 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r1, r0)
            if (r11 != r7) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L5e:
            if (r11 != r7) goto L61
            goto L63
        L61:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L63:
            if (r11 != r7) goto L66
            goto L7d
        L66:
            r11 = r5
        L67:
            r0.u = r6
            r0.f129303x = r8
            x4l.c r12 = r3.f
            java.lang.Object r11 = r12.d(r11, r9, r0)
            if (r11 != r7) goto L74
            goto L76
        L74:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L76:
            if (r11 != r7) goto L79
            goto L7b
        L79:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L7b:
            if (r11 != r7) goto L7e
        L7d:
            return r7
        L7e:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.d.E(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public d0 J(UUID uuid) {
        return RxRoom.createSingle((RoomDatabase) this.f250818a, true, false, new be7.l(this, uuid, 11));
    }

    public d0 M(Instant instant) {
        return RxRoom.createSingle((RoomDatabase) this.f250818a, true, false, new i2(this, instant, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(wi0.b r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dfj.f1
            if (r0 == 0) goto L13
            r0 = r6
            dfj.f1 r0 = (dfj.f1) r0
            int r1 = r0.f113962x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113962x = r1
            goto L18
        L13:
            dfj.f1 r0 = new dfj.f1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113962x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wi0.b r5 = r0.u
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f250818a
            ang.f r6 = (ang.f) r6
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.u = r5
            r0.f113962x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            do3.n r6 = (do3.n) r6
            java.lang.String r6 = r6.i
            dej.q0 r5 = r4.r0(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.d.O(wi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ha3.n
            if (r0 == 0) goto L13
            r0 = r7
            ha3.n r0 = (ha3.n) r0
            int r1 = r0.f150418w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150418w = r1
            goto L18
        L13:
            ha3.n r0 = new ha3.n
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f150418w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L72
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f250819b
            y80.a r7 = (y80.a) r7
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            ufm.c r7 = r7.e(r2)
            h56.a r2 = new h56.a
            r4 = 15
            r2.<init>(r6, r4)
            ha1.s r4 = new ha1.s
            r5 = 11
            r4.<init>(r5, r2)
            ufm.i r2 = new ufm.i
            r5 = 0
            r2.<init>(r7, r4, r5)
            ha1.k r7 = new ha1.k
            r4 = 15
            r7.<init>(r4)
            ha1.s r4 = new ha1.s
            r5 = 12
            r4.<init>(r5, r7)
            ufm.i r7 = new ufm.i
            r5 = 1
            r7.<init>(r2, r4, r5)
            java.lang.String r2 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.f150418w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.f224257a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.d.S(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ed6.c
            if (r0 == 0) goto L13
            r0 = r8
            ed6.c r0 = (ed6.c) r0
            int r1 = r0.f124921w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124921w = r1
            goto L18
        L13:
            ed6.c r0 = new ed6.c
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f124921w
            ed6.b r3 = ed6.b.f124920a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r8 = move-exception
            goto L7f
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f250819b     // Catch: java.lang.Throwable -> L2a
            kd6.a r8 = (kd6.a) r8     // Catch: java.lang.Throwable -> L2a
            akg.n r8 = r8.a()     // Catch: java.lang.Throwable -> L2a
            e6e.a r2 = new e6e.a     // Catch: java.lang.Throwable -> L2a
            r6 = 24
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            jhi.b r8 = mo3.a.g(r8, r4, r2, r5)     // Catch: java.lang.Throwable -> L2a
            r0.f124921w = r5     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = vkm.q.x(r8, r0)     // Catch: java.lang.Throwable -> L2a
            if (r8 != r1) goto L53
            return r1
        L53:
            wc6.d r8 = (wc6.d) r8     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "legalEntityRegion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.O
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            boolean r1 = r8 instanceof wc6.b
            if (r1 == 0) goto L7e
            wc6.b r8 = (wc6.b) r8
            wi0.b r8 = r8.f296347a
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L7e
            java.lang.Object r8 = r7.f250818a
            ed6.a r8 = (ed6.a) r8
            return r8
        L7e:
            return r3
        L7f:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.d.V(gim.c):java.lang.Object");
    }

    public akg.n W(List subscriptions, hfj.a currentDeviceStrategy) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(currentDeviceStrategy, "currentDeviceStrategy");
        return nim.a.v(u0.m(((g2e.t) this.f250819b).n(subscriptions, currentDeviceStrategy), ((c0) this.f250818a).b(w4l.h.f294642c)), new fvk.q(this, subscriptions));
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public void a0(ArrayList arrayList) {
        DBUtil.performBlocking((RoomDatabase) this.f250818a, false, true, new b(this, arrayList, 1));
    }

    @Override // oqh.a
    public oqh.b b(ViewController viewController, nqh.e eVar, uqh.r rVar, o5d.b bVar) {
        eVar.getClass();
        return new z((joh.w) this.f250818a, (joh.t) this.f250819b, eVar, rVar, bVar);
    }

    public void b0(f fVar) {
        DBUtil.performBlocking((RoomDatabase) this.f250818a, false, true, new b(this, fVar, 0));
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f250818a, ViewController.class);
        vc.s.h((String) this.f250819b, String.class);
        return new jyc.b((String) this.f250819b);
    }

    @Override // s1d.a
    public Object c(gim.c cVar) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s1d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof b38.a
            if (r0 == 0) goto L13
            r0 = r7
            b38.a r0 = (b38.a) r0
            int r1 = r0.f12013w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12013w = r1
            goto L18
        L13:
            b38.a r0 = new b38.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12013w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L56
        L36:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f250818a
            f38.c r7 = (f38.c) r7
            akg.n r7 = r7.a()
            axd.e r2 = new axd.e
            r5 = 20
            r2.<init>(r5)
            r5 = 0
            jhi.b r7 = mo3.a.g(r7, r5, r2, r4)
            r0.f12013w = r4
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L56
            goto L6c
        L56:
            com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext r7 = (com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext) r7
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r6.f250819b
            n28.d r7 = (n28.d) r7
            r0.f12013w = r3
            n1j.t r2 = new n1j.t
            r3 = 4
            r2.<init>(r3)
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r7
        L6e:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r10.d.d(gim.c):java.lang.Object");
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        defpackage.l lVar = (defpackage.l) this.f250819b;
        int i = defpackage.g.f139240a[taskEvent.ordinal()];
        if (i == 1) {
            lVar.d = (f1) this.f250818a;
            lVar.notifyMonitor(TaskEvent.FAILED, this);
        } else {
            if (i != 2) {
                return;
            }
            lVar.H = (DeviceInfos) objArr[0];
            lVar.a();
        }
    }

    @Override // ir0.h
    public Context i() {
        return (Context) this.f250818a;
    }

    @Override // ir0.h
    public void invalidate() {
        ((Drawable) this.f250819b).invalidateSelf();
    }

    public ArrayList j0(List accounts, TradingLegalEntityInformation tradingLegalEntityInformation, ybl.g productGroupsAvailability, Function1 parcelFactory) {
        n2l.j jVarA;
        int i;
        List listC;
        List list;
        f0 f0Var;
        int i2;
        d dVar = this;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
        Intrinsics.checkNotNullParameter(parcelFactory, "parcelFactory");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : accounts) {
            WealthAccount wealthAccount = (WealthAccount) obj2;
            if (jjh.b.a(wealthAccount) && wealthAccount.b5()) {
                arrayList.add(obj2);
            }
        }
        List<WealthAccount> listP0 = zhm.d0.P0(arrayList, (ijh.e) dVar.f250818a);
        ArrayList arrayList2 = new ArrayList();
        for (WealthAccount account : listP0) {
            fjh.a aVar = (fjh.a) dVar.f250819b;
            Object parcel = parcelFactory.invoke(account);
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
            Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            List list2 = null;
            if (account instanceof WealthAccount.Robo) {
                WealthAccount.Robo account2 = (WealthAccount.Robo) account;
                njh.e eVar = (njh.e) aVar.f135636b;
                eVar.getClass();
                gte.a aVar2 = eVar.d;
                Intrinsics.checkNotNullParameter(account2, "account");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WealthUiApi$Toggles.RoboStrategies roboStrategies = WealthUiApi$Toggles.RoboStrategies.f95863c;
                if (((jte.d) aVar2).c(roboStrategies)) {
                    list = f0.f322471a;
                } else {
                    listC = zhm.u.c(new RowDelegate.Model(j6.a.q("PRODUCT_WIDGET_NOT_ONBOARDED_", jjh.b.c(account2)), new RowDelegate.Model.MainImage.Image40(eVar.a(), null, null, false, null, false, 60), new TextLocalisedClause(((jte.d) aVar2).c(roboStrategies) ? R$string.wealth_invest_home_not_onboarded_strategies_title : R$string.wealth_invest_home_not_onboarded_robo_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_invest_home_not_onboarded_robo_description, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 532673496));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                    list = listC;
                }
            } else {
                if (account instanceof WealthAccount.Commodities) {
                    kjh.b bVar = (kjh.b) aVar.f135637c;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    boolean z = tradingLegalEntityInformation.f105106a == hel.b.GB;
                    listC = zhm.u.c(new RowDelegate.Model("PRODUCT_WIDGET_NOT_ONBOARDED_COMMODITIES", new RowDelegate.Model.MainImage.Image40((Image) bVar.f184409c.getValue(), null, null, false, null, false, 60), new TextLocalisedClause(R$string.wealth_invest_home_portfolio_commodity_header_title, null, null, 14), null, 0, new TextLocalisedClause(z ? R$string.wealth_invest_home_not_onboarded_commodities_uk_description : R$string.wealth_invest_home_portfolio_commodity_onboarding_subtitle, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 532673496));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                } else if (account instanceof WealthAccount.Margin) {
                    mjh.i iVar = (mjh.i) aVar.d;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_home_not_onboarded_cfds_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(tradingLegalEntityInformation.f105106a == hel.b.GB ? R$string.wealth_invest_home_not_onboarded_cfds_uk_description : R$string.wealth_invest_home_not_onboarded_cfds_description, null, null, 14);
                    mjh.g gVar = (mjh.g) iVar.f206048a;
                    gVar.getClass();
                    TextLocalisedClause title = new TextLocalisedClause(R$string.wealth_invest_home_portfolio_cfds_header_title, null, null, 14);
                    Image image = (Image) gVar.f206047a.getValue();
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(image, "image");
                    listC = zhm.u.c(new RowDelegate.Model("PRODUCT_WIDGET_NOT_ONBOARDED_MARGIN", new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 532673496));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                } else if (account instanceof WealthAccount.Securities) {
                    ojh.c cVar = (ojh.c) aVar.f135635a;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                    Intrinsics.checkNotNullParameter(productGroupsAvailability, "productGroupsAvailability");
                    Intrinsics.checkNotNullParameter(account, "account");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    if (account.d9()) {
                        f0Var = f0.f322471a;
                    } else {
                        String strC = jjh.b.c(account);
                        hel.b bVar2 = tradingLegalEntityInformation.f105106a;
                        if (bVar2 != null) {
                            String strQ = j6.a.q("PRODUCT_WIDGET_NOT_ONBOARDED_", strC);
                            TextLocalisedClause textLocalisedClauseB = cVar.b(tradingLegalEntityInformation, account);
                            switch (ojh.b.f225778c[bVar2.ordinal()]) {
                                case 1:
                                    i2 = R$string.wealth_invest_home_portfolio_stocks_header_description_uk_not_onboarded;
                                    break;
                                case 2:
                                    i2 = R$string.wealth_invest_home_portfolio_stocks_header_description_eea_not_onboarded;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    i2 = R$string.wealth_invest_home_portfolio_stocks_header_description_not_onboarded;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            List listC2 = zhm.u.c(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(cVar.a(account), null, null, false, null, false, 60), textLocalisedClauseB, null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 532673496));
                            yp0.b.k(listC2, 0, 0, 0, 0, 31);
                            list2 = listC2;
                        }
                        if (list2 == null) {
                            f0Var = f0.f322471a;
                        } else {
                            list = list2;
                        }
                    }
                    list = f0Var;
                } else {
                    if (!(account instanceof WealthAccount.TaxAdvantageWealthAccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WealthAccount.TaxAdvantageWealthAccount account3 = (WealthAccount.TaxAdvantageWealthAccount) account;
                    rjh.b bVar3 = (rjh.b) aVar.e;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(account3, "account");
                    Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String strQ2 = j6.a.q("PRODUCT_WIDGET_NOT_ONBOARDED_", jjh.b.c(account3));
                    if (account3 instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian) {
                        jVarA = new n2l.c(null);
                    } else if (account3 instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal) {
                        jVarA = n2l.g.f211589a;
                    } else {
                        if (!(account3 instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) && !(account3 instanceof WealthAccount.TaxAdvantageWealthAccount.Pea)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVarA = n2l.l.a(account3);
                    }
                    TextLocalisedClause textLocalisedClauseH = bVar3.f254676b.h(jVarA, tradingLegalEntityInformation.f105106a, null);
                    if (account3 instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
                        i = R$string.wealth_invest_home_not_onboarded_isa_description;
                    } else if (account3 instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
                        i = R$string.wealth_invest_home_not_onboarded_pea_description;
                    } else {
                        if (!(account3 instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.wealth_invest_home_not_onboarded_jisa_description;
                    }
                    listC = zhm.u.c(new RowDelegate.Model(strQ2, new RowDelegate.Model.MainImage.Image40(bVar3.a(account3), null, null, false, null, false, 60), textLocalisedClauseH, null, 0, new TextLocalisedClause(i, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 532673496));
                    yp0.b.k(listC, 0, 0, 0, 0, 31);
                }
                list = listC;
            }
            a0.x(list, arrayList2);
            dVar = this;
        }
        return arrayList2;
    }

    public TextLocalisedClause k0(soa.c type) {
        int i;
        Intrinsics.checkNotNullParameter(type, "type");
        int[] iArr = eoa.i.f127881a;
        switch (iArr[type.ordinal()]) {
            case 1:
            case 2:
                i = com.revolut.feature.profile.impl.R$string.profile_notification_settings_revolut_offers_title_v2;
                break;
            case 3:
                i = !((nyb.b) ((eub.a) this.f250818a)).f() ? com.revolut.feature.profile.impl.R$string.profile_notification_settings_partner_promotions_lifestyle_title : com.revolut.feature.profile.impl.R$string.profile_notification_settings_partner_promotions_title;
                break;
            case 4:
                i = !((jte.d) ((gte.a) this.f250819b)).c(InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c) ? com.revolut.feature.profile.impl.R$string.profile_notification_settings_trading_alerts_title : com.revolut.feature.profile.impl.R$string.profile_notification_settings_trading_insights_alerts_title;
                break;
            case 5:
                i = com.revolut.feature.profile.impl.R$string.profile_notification_settings_commodities_alerts_title;
                break;
            case 6:
                i = com.revolut.feature.profile.impl.R$string.profile_notification_settings_crypto_alerts_title;
                break;
            case 7:
                i = com.revolut.feature.profile.impl.R$string.profile_notification_settings_delivery_tracking_title;
                break;
            case 8:
                i = com.revolut.feature.profile.impl.R$string.profile_notification_settings_flight_tracking_title;
                break;
            default:
                throw new IllegalArgumentException("Unsupported NotificationSetting type " + type);
        }
        int i2 = iArr[type.ordinal()];
        return new TextLocalisedClause(i, i2 != 1 ? i2 != 2 ? f0.f322471a : zhm.u.c(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.revolutx_application_full_name, null, null, 14)) : zhm.u.c(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.application_full_name, null, null, 14)), null, 12);
    }

    public akg.n m0(ds6.j jVar, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c3 c3Var = (c3) this.f250818a;
        c3Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(c3Var.e.b(Unit.f186387a, loadingStrategy), new eq4.g(jVar, 28));
    }

    public t38.e q(List availableScopes, GlobalThemeDeclaration currentTheme) {
        efm.r rVarJ;
        Intrinsics.checkNotNullParameter(availableScopes, "availableScopes");
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Flow flowA = ((j0) this.f250819b).a();
        bn2.f fVar = (bn2.f) this.f250818a;
        Intrinsics.checkNotNullParameter(availableScopes, "availableScopes");
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        ArrayList<GlobalThemeDeclaration> arrayListF = ((gwl.d) fVar.e).f();
        cm2.e.Companion.getClass();
        Set setH1 = zhm.d0.h1(cm2.d.f25112b);
        for (GlobalThemeDeclaration globalThemeDeclaration : arrayListF) {
            if (globalThemeDeclaration.e2() == null || Intrinsics.f(globalThemeDeclaration.getF94454a(), currentTheme.getF94454a())) {
                setH1.addAll(globalThemeDeclaration.X6());
            }
        }
        ArrayList scopes = new ArrayList();
        for (Object obj2 : availableScopes) {
            if (setH1.contains(((em2.b) obj2).getId())) {
                scopes.add(obj2);
            }
        }
        km2.i iVar = fVar.f17007b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = scopes.iterator();
        while (true) {
            if (!it8.hasNext()) {
                efm.r map = te0.w.w(arrayList).map(new km2.b(0, new kkk.u(24)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return new t38.e(flowA, 24, rd0.e.b(map), new bn2.a(3, null));
            }
            em2.b bVar = (em2.b) it8.next();
            if (km2.e.f185686a[bVar.ordinal()] == 1) {
                rVarJ = nim.a.w(iVar.f185696g.f(Unit.f186387a, true), new km2.a(iVar, 0));
            } else {
                List list = (List) ((Map) iVar.f185695c.f185709a.getValue()).get(bVar);
                rVarJ = list != null ? zi0.c.j(list) : null;
            }
            efm.r map2 = rVarJ != null ? rVarJ.map(new kce.c(new ke7.v(bVar, 22), 29)) : null;
            if (map2 != null) {
                arrayList.add(map2);
            }
        }
    }

    public q0 r0(String str, wi0.b requiredCountry) {
        fj0.c cVarM;
        z80.b bVar = (z80.b) this.f250819b;
        Intrinsics.checkNotNullParameter(requiredCountry, "requiredCountry");
        if (str == null || (cVarM = bVar.m(str, requiredCountry.f297794a)) == null) {
            fj0.a aVar = fj0.b.Companion;
            String strJ = bVar.j(requiredCountry);
            aVar.getClass();
            Serializable serializableB = fj0.a.b(strJ);
            yhm.o.b(serializableB);
            return new q0(((fj0.b) serializableB).f135518a, "", requiredCountry);
        }
        int i = cVarM.f135519a;
        wi0.b bVarD = bVar.d(i);
        if (!bVarD.equals(requiredCountry)) {
            bVarD = null;
        }
        if (bVarD != null) {
            String str2 = cVarM.f135520b;
            fj0.b.Companion.getClass();
            Serializable serializableA = fj0.a.a(i);
            yhm.o.b(serializableA);
            return new q0(((fj0.b) serializableA).f135518a, str2, bVarD);
        }
        fj0.a aVar2 = fj0.b.Companion;
        String strJ2 = bVar.j(requiredCountry);
        aVar2.getClass();
        Serializable serializableB2 = fj0.a.b(strJ2);
        yhm.o.b(serializableB2);
        return new q0(((fj0.b) serializableB2).f135518a, "", requiredCountry);
    }

    public void s0(String str) {
        g8.b bVar;
        synchronized (this) {
            try {
                Object obj2 = ((HashMap) this.f250818a).get(str);
                y8.f.c(obj2, "Argument must not be null");
                bVar = (g8.b) obj2;
                int i = bVar.f141222b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f141222b);
                }
                int i2 = i - 1;
                bVar.f141222b = i2;
                if (i2 == 0) {
                    g8.b bVar2 = (g8.b) ((HashMap) this.f250818a).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    f4h.a aVar = (f4h.a) this.f250819b;
                    synchronized (((ArrayDeque) aVar.f132229b)) {
                        try {
                            if (((ArrayDeque) aVar.f132229b).size() < 10) {
                                ((ArrayDeque) aVar.f132229b).offer(bVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        bVar.f141221a.unlock();
    }

    public void u0(zli.b bVar, za zaVar) throws Throwable {
        Object objA;
        com.revolut.analytics.tracking.v3.c cVar = (com.revolut.analytics.tracking.v3.c) this.f250818a;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = ((ami.i) this.f250819b).a(bVar);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        cVar.a((String) objA, bVar.f323278a, zaVar, true);
    }

    public d(qfe.m spaceContentModelsProvider, jb7.f hideableAccountsSpaceFilter) {
        Intrinsics.checkNotNullParameter(spaceContentModelsProvider, "spaceContentModelsProvider");
        Intrinsics.checkNotNullParameter(hideableAccountsSpaceFilter, "hideableAccountsSpaceFilter");
        this.f250818a = spaceContentModelsProvider;
        this.f250819b = hideableAccountsSpaceFilter;
    }

    public d(f38.c watchlistContextProvider, n28.d widgetAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(watchlistContextProvider, "watchlistContextProvider");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        this.f250818a = watchlistContextProvider;
        this.f250819b = widgetAvailabilityProvider;
    }

    public d(bn2.f backgroundsCatalogInteractor, j0 themesInteractor) {
        Intrinsics.checkNotNullParameter(backgroundsCatalogInteractor, "backgroundsCatalogInteractor");
        Intrinsics.checkNotNullParameter(themesInteractor, "themesInteractor");
        this.f250818a = backgroundsCatalogInteractor;
        this.f250819b = themesInteractor;
    }

    public d(ang.f userInteractor, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f250818a = userInteractor;
        this.f250819b = phoneToolsProvider;
    }

    public d(c0 esimGiftingInteractor, g2e.t deviceGroupingInteractor) {
        Intrinsics.checkNotNullParameter(esimGiftingInteractor, "esimGiftingInteractor");
        Intrinsics.checkNotNullParameter(deviceGroupingInteractor, "deviceGroupingInteractor");
        this.f250818a = esimGiftingInteractor;
        this.f250819b = deviceGroupingInteractor;
    }

    public d(eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f250818a = revPointsAvailabilityInteractor;
        this.f250819b = featureToggleInteractor;
    }

    public d(ijh.e sortingComparator, fjh.a accountItemMapper) {
        Intrinsics.checkNotNullParameter(sortingComparator, "sortingComparator");
        Intrinsics.checkNotNullParameter(accountItemMapper, "accountItemMapper");
        this.f250818a = sortingComparator;
        this.f250819b = accountItemMapper;
    }

    public d(d0i.j navbarMapper, a0i.d tpslDetailsMapper, hzh.a stopLimitDetailsMapper) {
        Intrinsics.checkNotNullParameter(navbarMapper, "navbarMapper");
        Intrinsics.checkNotNullParameter(tpslDetailsMapper, "tpslDetailsMapper");
        Intrinsics.checkNotNullParameter(stopLimitDetailsMapper, "stopLimitDetailsMapper");
        this.f250818a = navbarMapper;
        this.f250819b = tpslDetailsMapper;
    }

    public d(zjh.i bannerMetadataDtoMapper, cr3.m rejectionMetadataDtoMapper, dr3.g creditPromptContentDtoMapper, cr3.j mortgageSignatureMetadataDtoMapper, cr3.k productArticlesMetadataDtoMapper) {
        Intrinsics.checkNotNullParameter(bannerMetadataDtoMapper, "bannerMetadataDtoMapper");
        Intrinsics.checkNotNullParameter(rejectionMetadataDtoMapper, "rejectionMetadataDtoMapper");
        Intrinsics.checkNotNullParameter(creditPromptContentDtoMapper, "creditPromptContentDtoMapper");
        Intrinsics.checkNotNullParameter(mortgageSignatureMetadataDtoMapper, "mortgageSignatureMetadataDtoMapper");
        Intrinsics.checkNotNullParameter(productArticlesMetadataDtoMapper, "productArticlesMetadataDtoMapper");
        this.f250818a = bannerMetadataDtoMapper;
        this.f250819b = creditPromptContentDtoMapper;
    }

    public d(jyc.h hVar) {
    }
}
