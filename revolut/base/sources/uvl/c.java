package uvl;

import a79.j;
import a79.k;
import aim.f;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.util.DBUtil;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreenContract$InputData;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import com.revolut.retail.feature.ratedetails.impl.network.alert.RatesAlertsService;
import dfj.e0;
import ip0.jp;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import le.u1;
import nvg.a0;
import nz8.d;
import org.bouncycastle.asn1.BERTags;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import s69.e;
import s69.g;
import sl3.u;
import tnb.g0;
import u10.h;
import u10.q;
import uam.i;
import vc.l;
import vc.t;
import vkm.y;
import wgb.v;
import wli.x;
import wp4.j0;
import wsg.n;
import wtc.b0;
import wvg.w0;
import y07.m;
import y20.r;
import y20.s;
import y20.z;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f283491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f283492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f283493c;
    public Object d;

    public c(t tVar, vc.c cVar, Intent intent, Context context) {
        this.d = tVar;
        this.f283491a = cVar;
        this.f283492b = intent;
        this.f283493c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(uvl.c r21, tof.a3 r22, tof.t3 r23, gim.c r24) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.a(uvl.c, tof.a3, tof.t3, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        r10 = r11;
     */
    /* JADX WARN: Path cross not found for [B:37:0x016d, B:48:0x01dd], limit reached: 64 */
    /* JADX WARN: Path cross not found for [B:48:0x01dd, B:37:0x016d], limit reached: 64 */
    /* JADX WARN: Path cross not found for [B:52:0x021b, B:63:0x028a], limit reached: 64 */
    /* JADX WARN: Path cross not found for [B:63:0x028a, B:52:0x021b], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01db -> B:37:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x020e -> B:37:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0288 -> B:52:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x02be -> B:52:0x021b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(uvl.c r18, y20.i r19, y20.u r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.b(uvl.c, y20.i, y20.u, gim.c):java.lang.Object");
    }

    public static final String c(c cVar, q qVar, h hVar) {
        Instant instant = hVar.f276283b;
        UUID uuid = qVar.f276320g;
        Instant instant2 = qVar.f276319c;
        Instant instant3 = qVar.f276318b;
        if (uuid == null && hVar.f276286h != null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        Instant instant4 = hVar.f;
        UUID uuid2 = hVar.f276282a;
        if (!Intrinsics.f(instant, instant3)) {
            arrayList.add("createdAt of " + uuid2 + ": " + instant3 + " -> " + instant);
        }
        if (!Intrinsics.f(hVar.f276284c, qVar.d) || !Intrinsics.f(hVar.f276285g, qVar.e) || hVar.e != qVar.f) {
            arrayList.add("scope of " + uuid2);
        }
        if (!Intrinsics.f(instant4, instant2)) {
            arrayList.add("ticketCreatedAt of " + uuid2 + ": " + instant2 + " -> " + instant4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return d0.k0(arrayList, "; ", null, null, 0, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(uvl.c r7, y20.t r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof y20.a0
            if (r0 == 0) goto L13
            r0 = r9
            y20.a0 r0 = (y20.a0) r0
            int r1 = r0.f310448x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310448x = r1
            goto L18
        L13:
            y20.a0 r0 = new y20.a0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f310448x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            y20.t r8 = r0.u
            yhm.o.b(r9)
            goto L8d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r9)
            java.lang.Object r7 = r7.f283491a
            d4m.a r7 = (d4m.a) r7
            java.lang.Object r7 = r7.get()
            com.revolut.chat.data.db.ChatDatabase r7 = (com.revolut.chat.data.db.ChatDatabase) r7
            r10.q r7 = r7.m()
            r0.u = r8
            r0.f310448x = r3
            java.lang.Object r9 = r7.f250849b
            androidx.room.RoomDatabase r9 = (androidx.room.RoomDatabase) r9
            boolean r2 = r8 instanceof y20.q
            r4 = 0
            if (r2 == 0) goto L61
            r2 = r8
            y20.q r2 = (y20.q) r2
            java.util.UUID r2 = r2.f310535a
            be7.l r5 = new be7.l
            r6 = 14
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = androidx.room.util.DBUtil.performSuspending(r9, r3, r4, r5, r0)
        L5f:
            r9 = r7
            goto L8a
        L61:
            boolean r2 = r8 instanceof y20.s
            if (r2 == 0) goto L75
            r2 = r8
            y20.s r2 = (y20.s) r2
            v30.c0 r2 = r2.f310545b
            r10.c r5 = new r10.c
            r6 = 2
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = androidx.room.util.DBUtil.performSuspending(r9, r3, r4, r5, r0)
            goto L5f
        L75:
            boolean r2 = r8 instanceof y20.r
            if (r2 == 0) goto La1
            r2 = r8
            y20.r r2 = (y20.r) r2
            java.util.UUID r2 = r2.f310540b
            be7.l r5 = new be7.l
            r6 = 15
            r5.<init>(r7, r2, r6)
            java.lang.Object r7 = androidx.room.util.DBUtil.performSuspending(r9, r3, r4, r5, r0)
            goto L5f
        L8a:
            if (r9 != r1) goto L8d
            return r1
        L8d:
            u10.h r9 = (u10.h) r9
            if (r9 != 0) goto L94
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L94:
            org.joda.time.Instant r7 = r9.f276283b
            java.util.UUID r9 = r9.f276286h
            boolean r7 = s(r8, r7, r9)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        La1:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.d(uvl.c, y20.t, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025f A[Catch: RuntimeException -> 0x0264, CancellationException -> 0x02a5, TryCatch #2 {CancellationException -> 0x02a5, RuntimeException -> 0x0264, blocks: (B:93:0x024d, B:95:0x025f, B:99:0x0266, B:101:0x026a, B:103:0x029f, B:104:0x02a4), top: B:114:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0266 A[Catch: RuntimeException -> 0x0264, CancellationException -> 0x02a5, TryCatch #2 {CancellationException -> 0x02a5, RuntimeException -> 0x0264, blocks: (B:93:0x024d, B:95:0x025f, B:99:0x0266, B:101:0x026a, B:103:0x029f, B:104:0x02a4), top: B:114:0x024d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(uvl.c r24, y20.t r25, java.util.ArrayList r26, java.util.LinkedHashMap r27, java.util.HashSet r28, gim.c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.e(uvl.c, y20.t, java.util.ArrayList, java.util.LinkedHashMap, java.util.HashSet, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(uvl.c r11, java.util.List r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.f(uvl.c, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:35:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:30:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(uvl.c r12, java.util.List r13, kotlin.jvm.functions.Function2 r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.g(uvl.c, java.util.List, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.util.Map r8, final r10.q r9, y20.p r10, final int r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.i(java.util.Map, r10.q, y20.p, int, gim.c):java.lang.Object");
    }

    public static final f o(List list, Map map) {
        f builder = new f();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            y20.a aVar = (y20.a) it8.next();
            int iIntValue = ((Number) r0.h(aVar, map)).intValue();
            Iterator it9 = aVar.e.iterator();
            while (it9.hasNext()) {
                builder.put((UUID) it9.next(), Integer.valueOf(iIntValue));
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static List p(mwg.h hVar) {
        List list = hVar.f209462a;
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static boolean s(y20.t tVar, Instant instant, UUID uuid) {
        if (tVar instanceof y20.q) {
            return Intrinsics.f(instant, ((y20.q) tVar).f310536b);
        }
        if (tVar instanceof s) {
            return Intrinsics.f(uuid, ((s) tVar).f310544a);
        }
        if (tVar instanceof r) {
            return Intrinsics.f(uuid, ((r) tVar).f310539a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String x(w0 w0Var) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("complex_analytics_dividends_" + d.t(w0Var.f300489b, null) + "_" + w0Var.d.f306286a);
        return sb6.toString();
    }

    /* JADX WARN: Path cross not found for [B:34:0x00cc, B:49:0x012b], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:34:0x00cc, B:50:0x012d], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:38:0x00e1, B:41:0x0101], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:47:0x0125, B:43:0x0107], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:47:0x0125, B:44:0x0109], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0129 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x012b -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0147 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(u10.q r9, u10.q r10, java.util.Collection r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.h(u10.q, u10.q, java.util.Collection, gim.c):java.lang.Object");
    }

    public void j(byte[] bArr) {
        i iVar = (i) this.f283493c;
        if (iVar == null) {
            throw new IllegalStateException("previewSize is null. Frame was not added?");
        }
        zam.a aVar = new zam.a(iVar, bArr, ((jp) this.d).f164899a);
        Iterator it8 = ((LinkedHashSet) this.f283492b).iterator();
        while (it8.hasNext()) {
            ((Function1) it8.next()).invoke(aVar);
        }
        ((Camera) this.f283491a).addCallbackBuffer(aVar.f320747b);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public ArrayList k(List items) {
        String str;
        v69.c cVar;
        c cVar2 = this;
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            s69.d dVar = (s69.d) it8.next();
            String str2 = dVar.f260158a;
            String strG = u1.g(dVar.f260159b, (Map) cVar2.f283493c);
            DateTime dateTime = dVar.f260160c;
            String strG2 = u1.g(dVar.d, cVar2.d);
            String str3 = dVar.f;
            String str4 = dVar.f260162h;
            String str5 = dVar.f260161g;
            String str6 = dVar.i;
            String str7 = dVar.f260163j;
            ArrayList arrayList2 = dVar.f260164l;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i));
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                e eVar = (e) it9.next();
                arrayList3.add(new v69.a(eVar.f260166a, eVar.f260167b, eVar.f260168c));
                it9 = it9;
                it8 = it8;
            }
            Iterator it10 = it8;
            s69.h hVar = dVar.e;
            if (hVar != null) {
                str = str4;
                cVar = new v69.c(hVar.f260169a, hVar.f260170b, hVar.f260171c, hVar.d);
            } else {
                str = str4;
                cVar = null;
            }
            arrayList.add(new v69.b(str2, strG, dateTime, strG2, str3, str5, str6, str7, dVar.f260165m, cVar, arrayList3, dVar.k, str));
            cVar2 = this;
            it8 = it10;
            i = 10;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public ArrayList l(List items) {
        String string;
        Map map;
        s69.h hVar;
        String campaignId;
        String messageId;
        String inboxId;
        c cVar = this;
        ?? r2 = cVar.d;
        Map map2 = (Map) cVar.f283493c;
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList<j> arrayList = new ArrayList();
        for (Object obj2 : items) {
            j jVar = (j) obj2;
            if (map2.containsKey(jVar.getType()) && r2.containsKey(jVar.getState())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        ?? r23 = r2;
        for (j jVar2 : arrayList) {
            String id10 = jVar2.getId();
            g gVar = (g) u1.u(jVar2.getType(), map2);
            DateTime dateTime = new DateTime(jVar2.getCreatedDate());
            s69.f fVar = (s69.f) u1.u(jVar2.getState(), r23);
            String title = jVar2.getContent().getTitle();
            String subtitle = jVar2.getContent().getSubtitle();
            String body = jVar2.getContent().getBody();
            String strReplace = body != null ? ((Regex) cVar.f283492b).replace(body, "<br>&nbsp;</li><li>") : null;
            String icon = jVar2.getContent().getIcon();
            String deeplink = jVar2.getContent().getDeeplink();
            k messageMetadata = jVar2.getMessageMetadata();
            if (deeplink != null) {
                Uri.Builder builderBuildUpon = ((f80.b) ((f80.a) cVar.f283491a)).f(deeplink).buildUpon();
                if (messageMetadata != null && (inboxId = messageMetadata.getInboxId()) != null) {
                    builderBuildUpon.appendQueryParameter("inbox_id", inboxId);
                }
                if (messageMetadata != null && (messageId = messageMetadata.getMessageId()) != null) {
                    builderBuildUpon.appendQueryParameter("message_id", messageId);
                }
                if (messageMetadata != null && (campaignId = messageMetadata.getCampaignId()) != null) {
                    builderBuildUpon.appendQueryParameter("campaign_id", campaignId);
                }
                string = builderBuildUpon.build().toString();
            } else {
                string = null;
            }
            List buttons = jVar2.getContent().getButtons();
            ArrayList arrayList3 = new ArrayList(w.t(buttons, 10));
            Iterator it8 = buttons.iterator();
            ?? r210 = r23;
            while (it8.hasNext()) {
                a79.h hVar2 = (a79.h) it8.next();
                arrayList3.add(new e(hVar2.getId(), hVar2.getLabel(), hVar2.getDeeplink()));
                it8 = it8;
                r210 = r210;
            }
            ?? r222 = r210;
            String asset = jVar2.getContent().getAsset();
            k messageMetadata2 = jVar2.getMessageMetadata();
            if (messageMetadata2 != null) {
                map = map2;
                hVar = new s69.h(messageMetadata2.getMessageId(), messageMetadata2.getCampaignId(), messageMetadata2.getPushId(), messageMetadata2.getTileId());
            } else {
                map = map2;
                hVar = null;
            }
            arrayList2.add(new s69.d(id10, gVar, dateTime, fVar, hVar, title, subtitle, strReplace, icon, string, asset, arrayList3, jVar2.getViewCount()));
            cVar = this;
            r23 = r222;
            map2 = map;
        }
        return arrayList2;
    }

    public ArrayList m(List entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = entities.iterator();
        while (it8.hasNext()) {
            s69.d dVarN = n((v69.b) it8.next());
            if (dVarN != null) {
                arrayList.add(dVarN);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public s69.d n(v69.b entity) {
        ?? r2 = this.d;
        Intrinsics.checkNotNullParameter(entity, "entity");
        Map map = (Map) this.f283493c;
        String str = entity.f286336b;
        String str2 = entity.d;
        if (!map.containsKey(str) || !r2.containsKey(str2)) {
            return null;
        }
        String str3 = entity.f286335a;
        g gVar = (g) u1.u(entity.f286336b, map);
        DateTime dateTime = entity.f286337c;
        s69.f fVar = (s69.f) u1.u(str2, r2);
        String str4 = entity.e;
        String str5 = entity.f;
        String str6 = entity.f286342m;
        String str7 = entity.f286338g;
        String str8 = entity.f286339h;
        List<v69.a> list = entity.k;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (v69.a aVar : list) {
            arrayList.add(new e(aVar.getId(), aVar.getLabel(), aVar.getDeeplink()));
        }
        v69.c cVar = entity.f286340j;
        return new s69.d(str3, gVar, dateTime, fVar, cVar != null ? new s69.h(cVar.f286343a, cVar.f286344b, cVar.f286345c, cVar.d) : null, str4, str5, str6, str7, str8, entity.f286341l, arrayList, entity.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0136, code lost:
    
        if (nim.a.a(r12, r1) != r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb A[LOOP:0: B:40:0x00e5->B:42:0x00eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.q(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object r(List list, y20.t tVar, gim.c cVar) {
        Object obj2 = ((d4m.a) this.f283491a).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        ChatDatabase chatDatabase = (ChatDatabase) obj2;
        Object objWithTransaction = RoomDatabaseKt.withTransaction(chatDatabase, new z(tVar, list, chatDatabase, this, chatDatabase.m(), null), cVar);
        return objWithTransaction == fim.a.COROUTINE_SUSPENDED ? objWithTransaction : Unit.f186387a;
    }

    public jhi.k t(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        eb5.a aVar = (eb5.a) this.f283491a;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jb5.a aVar2 = aVar.f124296a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return n14.k.s(rd0.e.n(xam.a.h(new u29.c(this, loadingStrategy, (Continuation) null, 8), aVar2.d.b(Unit.f186387a, loadingStrategy)), h0.f322473a), f0.f322471a);
    }

    public vkm.d u(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        hw3.f fVar = (hw3.f) this.f283493c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p24.r rVar = fVar.f156065a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rVar.d.b(Unit.f186387a, loadingStrategy);
    }

    public vkm.f v() {
        int i = 3;
        Continuation continuation = null;
        y yVarE = rd0.e.e(new e0(vkm.q.g(((se9.d) this.f283492b).f262164b), i), h0.f322473a, new uyd.e0(i, 18, continuation));
        jhi.k kVarU = nim.a.u(new v(this, continuation, 28), ((skd.i) this.f283491a).c(new SlotContext(akd.s.SECURITY_HUB)));
        otc.b bVar = (otc.b) this.d;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return vkm.q.J(yVarE, new t38.e(kVarU, 24, bVar == otc.b.RETAIL ? new e0(vkm.q.g(((zt2.e) ((st2.e) this.f283493c)).f325057b), 2) : new go.g(0, 2), new b0(i, continuation)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        if (nim.a.a(r9, r1) == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(java.util.List r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uvl.c.w(java.util.List, gim.c):java.lang.Object");
    }

    @Override // vc.l
    public void zza() {
        t tVar = (t) this.d;
        tVar.f287606g.post(new dki.v(tVar, (vc.c) this.f283491a, 5, 0));
    }

    @Override // vc.l
    public void zzb(int i) {
        t tVar = (t) this.d;
        tVar.f287606g.post(new dki.v(tVar, (vc.c) this.f283491a, 6, i));
    }

    @Override // vc.l
    public void zzc() {
        Intent intent = (Intent) this.f283492b;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((t) this.d).f287603a.c("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            ((Context) this.f283493c).sendBroadcast(intent);
        }
    }

    public c(efd.a alertsInteractor, xfd.i mapper, l3d.h0 watchlistInteractor, m3d.j watchlistDestinationProvider) {
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(watchlistDestinationProvider, "watchlistDestinationProvider");
        this.f283491a = alertsInteractor;
        this.f283492b = mapper;
        this.f283493c = watchlistInteractor;
        this.d = watchlistDestinationProvider;
    }

    public c(ffk.t pricingPlanInteractor, qrk.d widgetDismissStatusInteractor, ybl.l configInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(widgetDismissStatusInteractor, "widgetDismissStatusInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f283491a = pricingPlanInteractor;
        this.f283492b = widgetDismissStatusInteractor;
        this.f283493c = configInteractor;
        this.d = deeplinkHandler;
    }

    public c(u remoteContactsRepository, yf.c virtualContactsRepository, ao.h contactsDataStorage, g0 trustedRevolutContactsProvider, xl3.e deviceContactMapper) {
        Intrinsics.checkNotNullParameter(remoteContactsRepository, "remoteContactsRepository");
        Intrinsics.checkNotNullParameter(virtualContactsRepository, "virtualContactsRepository");
        Intrinsics.checkNotNullParameter(contactsDataStorage, "contactsDataStorage");
        Intrinsics.checkNotNullParameter(trustedRevolutContactsProvider, "trustedRevolutContactsProvider");
        Intrinsics.checkNotNullParameter(deviceContactMapper, "deviceContactMapper");
        this.f283491a = remoteContactsRepository;
        this.f283492b = virtualContactsRepository;
        this.f283493c = contactsDataStorage;
        this.d = trustedRevolutContactsProvider;
    }

    public c(klf.h0 commonDataSource, zkf.f dataResolver, c3j.b bankInformationProvider, m3j.h beneficiaryAccountFieldsMapper, zkf.g pixBeneficiaryMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(dataResolver, "dataResolver");
        Intrinsics.checkNotNullParameter(bankInformationProvider, "bankInformationProvider");
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldsMapper, "beneficiaryAccountFieldsMapper");
        Intrinsics.checkNotNullParameter(pixBeneficiaryMapper, "pixBeneficiaryMapper");
        this.f283491a = commonDataSource;
        this.f283492b = dataResolver;
        this.f283493c = bankInformationProvider;
        this.d = beneficiaryAccountFieldsMapper;
    }

    public c(Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f283491a = camera;
        this.f283492b = new LinkedHashSet();
        this.d = sam.c.f261459c;
    }

    public c(UpiIntentPaymentReviewScreenContract$InputData inputData, n walletInteractor, bf2.c upiRepository, vz1.g apmPaymentsAuthorisationsRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(upiRepository, "upiRepository");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.f283491a = inputData;
        this.f283492b = walletInteractor;
        this.f283493c = upiRepository;
        this.d = apmPaymentsAuthorisationsRepository;
    }

    public c(klf.h0 commonDataSource, pff.a transactionTroubleshooterInteractor, gte.a featureToggleInteractor, kgm.i helpRouter) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionTroubleshooterInteractor, "transactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(helpRouter, "helpRouter");
        this.f283491a = commonDataSource;
        this.f283492b = transactionTroubleshooterInteractor;
        this.f283493c = featureToggleInteractor;
        this.d = helpRouter;
    }

    public c(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f283491a = uriHelper;
        this.f283492b = new Regex("</li>\\s*<br\\s*/?>\\s*<li>", kotlin.text.q.IGNORE_CASE);
        this.f283493c = q0.c(new Pair("GENERAL", g.GENERAL));
        this.d = r0.k(new Pair("VIEWED", s69.f.VIEWED), new Pair("CREATED", s69.f.CREATED), new Pair("OPENED", s69.f.OPENED));
    }

    public c(eb5.a creditTilesInteractor, aq3.a creditApplicationChecklistAvailabilityProvider, hw3.f creditApplicationDashboardInteractor, kw3.a creditDiscoverInteractor) {
        Intrinsics.checkNotNullParameter(creditTilesInteractor, "creditTilesInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationChecklistAvailabilityProvider, "creditApplicationChecklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter(creditApplicationDashboardInteractor, "creditApplicationDashboardInteractor");
        Intrinsics.checkNotNullParameter(creditDiscoverInteractor, "creditDiscoverInteractor");
        this.f283491a = creditTilesInteractor;
        this.f283492b = creditApplicationChecklistAvailabilityProvider;
        this.f283493c = creditApplicationDashboardInteractor;
        this.d = creditDiscoverInteractor;
    }

    public c(skd.i slotManagerInteractor, se9.d passcodeReminderPigeonRepository, st2.e callSecurityPermissionBannerInteractor, otc.b securityHubType) {
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(passcodeReminderPigeonRepository, "passcodeReminderPigeonRepository");
        Intrinsics.checkNotNullParameter(callSecurityPermissionBannerInteractor, "callSecurityPermissionBannerInteractor");
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        this.f283491a = slotManagerInteractor;
        this.f283492b = passcodeReminderPigeonRepository;
        this.f283493c = callSecurityPermissionBannerInteractor;
        this.d = securityHubType;
    }

    public c(gpk.c ratesAlertsDao, RatesAlertsService ratesAlertsService, ne0.d memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(ratesAlertsDao, "ratesAlertsDao");
        Intrinsics.checkNotNullParameter(ratesAlertsService, "ratesAlertsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f283491a = ratesAlertsDao;
        this.f283492b = ratesAlertsService;
        this.f283493c = memoryCache;
        new qe0.f(new wp5.v(this, networkStateRepository, 10), new j0(this, 1), new wp5.w(8), new wp5.w(9));
        final int i = 1;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wpk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f299354b;

            {
                this.f299354b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                uvl.c cVar = this.f299354b;
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List<gpk.a> list = (List) DBUtil.performBlocking((RoomDatabase) ((gpk.c) cVar.f283491a).f145463a, true, false, new gn.a(20));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (gpk.a aVar : list) {
                            Object obj3 = a.f299350a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f145455a;
                            qta.h hVar = (qta.h) u1.u(aVar.f145456b, a.f299350a);
                            BigDecimal bigDecimal = new BigDecimal(aVar.f145457c);
                            BigDecimal bigDecimal2 = new BigDecimal(aVar.d);
                            xi0.a aVar2 = xi0.b.Companion;
                            String str2 = aVar.e;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str2);
                            BigDecimal ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                            arrayList.add(new qta.i(str, hVar, bigDecimal, bigDecimal2, bVarA, xi0.a.a(aVar.f), aVar.f145458g, aVar.f145459h));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<spk.c> alerts = ((RatesAlertsService) cVar.f283492b).getAlerts();
                        wp5.x xVar = new wp5.x(new wp5.w(7), 5);
                        alerts.getClass();
                        ufm.i iVar = new ufm.i(alerts, xVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) ((ne0.d) cVar.f283493c).get("RATE_ALERT_LIST");
                }
            }
        });
        final int i2 = 2;
        Function1 function1 = new Function1(this) { // from class: wpk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f299354b;

            {
                this.f299354b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                uvl.c cVar = this.f299354b;
                Unit it8 = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List<gpk.a> list = (List) DBUtil.performBlocking((RoomDatabase) ((gpk.c) cVar.f283491a).f145463a, true, false, new gn.a(20));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (gpk.a aVar : list) {
                            Object obj3 = a.f299350a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f145455a;
                            qta.h hVar = (qta.h) u1.u(aVar.f145456b, a.f299350a);
                            BigDecimal bigDecimal = new BigDecimal(aVar.f145457c);
                            BigDecimal bigDecimal2 = new BigDecimal(aVar.d);
                            xi0.a aVar2 = xi0.b.Companion;
                            String str2 = aVar.e;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str2);
                            BigDecimal ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                            arrayList.add(new qta.i(str, hVar, bigDecimal, bigDecimal2, bVarA, xi0.a.a(aVar.f), aVar.f145458g, aVar.f145459h));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<spk.c> alerts = ((RatesAlertsService) cVar.f283492b).getAlerts();
                        wp5.x xVar = new wp5.x(new wp5.w(7), 5);
                        alerts.getClass();
                        ufm.i iVar = new ufm.i(alerts, xVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) ((ne0.d) cVar.f283493c).get("RATE_ALERT_LIST");
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wpk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f299352b;

            {
                this.f299352b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                List value = (List) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ((ne0.d) this.f299352b.f283493c).f("RATE_ALERT_LIST", value);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "alerts");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : value) {
                            if (((qta.i) obj4).f249055b != qta.h.CANCELLED) {
                                arrayList.add(obj4);
                            } else {
                                arrayList2.add(obj4);
                            }
                        }
                        gpk.c cVar = (gpk.c) this.f299352b.f283491a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(a.b((qta.i) it8.next()));
                        }
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
                        Iterator it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(a.b((qta.i) it9.next()));
                        }
                        DBUtil.performBlocking((RoomDatabase) cVar.f145463a, false, true, new g31.e(cVar, 8, arrayList3, arrayList4));
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function12 = new Function1(this) { // from class: wpk.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f299354b;

            {
                this.f299354b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                uvl.c cVar = this.f299354b;
                Unit it8 = (Unit) obj2;
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        List<gpk.a> list = (List) DBUtil.performBlocking((RoomDatabase) ((gpk.c) cVar.f283491a).f145463a, true, false, new gn.a(20));
                        ArrayList arrayList = new ArrayList(w.t(list, 10));
                        for (gpk.a aVar : list) {
                            Object obj3 = a.f299350a;
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            String str = aVar.f145455a;
                            qta.h hVar = (qta.h) u1.u(aVar.f145456b, a.f299350a);
                            BigDecimal bigDecimal = new BigDecimal(aVar.f145457c);
                            BigDecimal bigDecimal2 = new BigDecimal(aVar.d);
                            xi0.a aVar2 = xi0.b.Companion;
                            String str2 = aVar.e;
                            aVar2.getClass();
                            xi0.b bVarA = xi0.a.a(str2);
                            BigDecimal ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                            arrayList.add(new qta.i(str, hVar, bigDecimal, bigDecimal2, bVarA, xi0.a.a(aVar.f), aVar.f145458g, aVar.f145459h));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<spk.c> alerts = ((RatesAlertsService) cVar.f283492b).getAlerts();
                        wp5.x xVar = new wp5.x(new wp5.w(7), 5);
                        alerts.getClass();
                        ufm.i iVar = new ufm.i(alerts, xVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) ((ne0.d) cVar.f283493c).get("RATE_ALERT_LIST");
                }
            }
        };
        final int i5 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wpk.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f299352b;

            {
                this.f299352b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                List value = (List) obj3;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ((ne0.d) this.f299352b.f283493c).f("RATE_ALERT_LIST", value);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "alerts");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : value) {
                            if (((qta.i) obj4).f249055b != qta.h.CANCELLED) {
                                arrayList.add(obj4);
                            } else {
                                arrayList2.add(obj4);
                            }
                        }
                        gpk.c cVar = (gpk.c) this.f299352b.f283491a;
                        ArrayList arrayList3 = new ArrayList(w.t(arrayList, 10));
                        Iterator it8 = arrayList.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(a.b((qta.i) it8.next()));
                        }
                        ArrayList arrayList4 = new ArrayList(w.t(arrayList2, 10));
                        Iterator it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            arrayList4.add(a.b((qta.i) it9.next()));
                        }
                        DBUtil.performBlocking((RoomDatabase) cVar.f145463a, false, true, new g31.e(cVar, 8, arrayList3, arrayList4));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public c(b80.c networkStateRepository, ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, a0 complexAnalyticsDividendsDao) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsDividendsDao, "complexAnalyticsDividendsDao");
        this.f283491a = complexWealthAnalyticsService;
        this.f283492b = memoryCache;
        this.f283493c = complexAnalyticsDividendsDao;
        final int i = 0;
        uj0.b bVarK0 = te0.w.k0(networkStateRepository, new Function1(this) { // from class: wvg.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f300328b;

            {
                this.f300328b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                w0 params = (w0) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = (ComplexWealthAnalyticsService) this.f300328b.f283491a;
                        String str = params.f300488a;
                        String strT = nz8.d.t(params.f300489b, null);
                        String str2 = params.d.f306286a;
                        String string = params.f300490c.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        efm.d0<uvg.j> dividends = complexWealthAnalyticsService2.getDividends(str, strT, str2, string, uvl.c.p(params.e), null, null);
                        wsg.k kVar = new wsg.k(new wuk.c(19), 15);
                        dividends.getClass();
                        ufm.i iVar = new ufm.i(dividends, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List list = (List) ((ne0.j) this.f300328b.f283492b).get(uvl.c.x(params));
                        if (list != null) {
                            List listP = uvl.c.p(params.e);
                            List list2 = listP;
                            if (list2 == null || list2.isEmpty()) {
                                return list;
                            }
                            List list3 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it8 = list3.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((mwg.g) it8.next()).f209461c);
                            }
                            if (zhm.d0.i1(arrayList).containsAll(list2)) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list3) {
                                    if (listP.contains(((mwg.g) obj3).f209461c)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                return arrayList2;
                            }
                        }
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.a0 a0Var = (nvg.a0) this.f300328b.f283493c;
                        eel.c timeSpan = params.f300489b;
                        String currency = params.d.f306286a;
                        List listP2 = uvl.c.p(params.e);
                        a0Var.getClass();
                        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter("LOCAL_PORTFOLIO_ID", "portfolioId");
                        List list4 = listP2;
                        List<pvg.u> listE = (list4 == null || list4.isEmpty()) ? a0Var.e(timeSpan, currency) : a0Var.d(timeSpan, currency, listP2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listE, 10));
                        for (pvg.u uVar : listE) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            arrayList3.add(new mwg.g(uVar.e, uVar.f, uVar.f240226g, hx7.a.v(uVar.f240227h)));
                        }
                        return arrayList3;
                }
            }
        });
        final int i2 = 1;
        Function1 function1 = new Function1(this) { // from class: wvg.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f300328b;

            {
                this.f300328b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                w0 params = (w0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = (ComplexWealthAnalyticsService) this.f300328b.f283491a;
                        String str = params.f300488a;
                        String strT = nz8.d.t(params.f300489b, null);
                        String str2 = params.d.f306286a;
                        String string = params.f300490c.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        efm.d0<uvg.j> dividends = complexWealthAnalyticsService2.getDividends(str, strT, str2, string, uvl.c.p(params.e), null, null);
                        wsg.k kVar = new wsg.k(new wuk.c(19), 15);
                        dividends.getClass();
                        ufm.i iVar = new ufm.i(dividends, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List list = (List) ((ne0.j) this.f300328b.f283492b).get(uvl.c.x(params));
                        if (list != null) {
                            List listP = uvl.c.p(params.e);
                            List list2 = listP;
                            if (list2 == null || list2.isEmpty()) {
                                return list;
                            }
                            List list3 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it8 = list3.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((mwg.g) it8.next()).f209461c);
                            }
                            if (zhm.d0.i1(arrayList).containsAll(list2)) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list3) {
                                    if (listP.contains(((mwg.g) obj3).f209461c)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                return arrayList2;
                            }
                        }
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.a0 a0Var = (nvg.a0) this.f300328b.f283493c;
                        eel.c timeSpan = params.f300489b;
                        String currency = params.d.f306286a;
                        List listP2 = uvl.c.p(params.e);
                        a0Var.getClass();
                        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter("LOCAL_PORTFOLIO_ID", "portfolioId");
                        List list4 = listP2;
                        List<pvg.u> listE = (list4 == null || list4.isEmpty()) ? a0Var.e(timeSpan, currency) : a0Var.d(timeSpan, currency, listP2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listE, 10));
                        for (pvg.u uVar : listE) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            arrayList3.add(new mwg.g(uVar.e, uVar.f, uVar.f240226g, hx7.a.v(uVar.f240227h)));
                        }
                        return arrayList3;
                }
            }
        };
        final int i3 = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f300342b;

            {
                this.f300342b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                w0 params = (w0) obj2;
                List domain = (List) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = (ne0.j) this.f300342b.f283492b;
                        Collection collection = (List) jVar.get(uvl.c.x(params));
                        if (collection == null) {
                            collection = zhm.f0.f322471a;
                        }
                        ArrayList arrayListF1 = zhm.d0.f1(collection);
                        for (Object obj4 : domain) {
                            Iterator it8 = arrayListF1.iterator();
                            int i5 = 0;
                            while (true) {
                                if (it8.hasNext()) {
                                    if (!Intrinsics.f((mwg.g) it8.next(), (mwg.g) obj4)) {
                                        i5++;
                                    }
                                } else {
                                    i5 = -1;
                                }
                            }
                            if (i5 >= 0) {
                                arrayListF1.set(i5, obj4);
                            } else {
                                arrayListF1.add(obj4);
                            }
                        }
                        jVar.f(uvl.c.x(params), arrayListF1);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        nvg.a0 a0Var = (nvg.a0) this.f300342b.f283493c;
                        List<mwg.g> list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.g gVar : list) {
                            eel.c timeSpan = params.f300489b;
                            xi0.b currency = params.d;
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            Intrinsics.checkNotNullParameter("LOCAL_PORTFOLIO_ID", "portfolioId");
                            arrayList.add(new pvg.u(timeSpan, currency.f306286a, "LOCAL_PORTFOLIO_ID", null, gVar.f209459a, gVar.f209460b, gVar.f209461c, hx7.a.A(gVar.d)));
                        }
                        a0Var.c(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i5 = 2;
        Function1 function12 = new Function1(this) { // from class: wvg.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f300328b;

            {
                this.f300328b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                w0 params = (w0) obj2;
                switch (i5) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        ComplexWealthAnalyticsService complexWealthAnalyticsService2 = (ComplexWealthAnalyticsService) this.f300328b.f283491a;
                        String str = params.f300488a;
                        String strT = nz8.d.t(params.f300489b, null);
                        String str2 = params.d.f306286a;
                        String string = params.f300490c.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        efm.d0<uvg.j> dividends = complexWealthAnalyticsService2.getDividends(str, strT, str2, string, uvl.c.p(params.e), null, null);
                        wsg.k kVar = new wsg.k(new wuk.c(19), 15);
                        dividends.getClass();
                        ufm.i iVar = new ufm.i(dividends, kVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 1:
                        Intrinsics.checkNotNullParameter(params, "params");
                        List list = (List) ((ne0.j) this.f300328b.f283492b).get(uvl.c.x(params));
                        if (list != null) {
                            List listP = uvl.c.p(params.e);
                            List list2 = listP;
                            if (list2 == null || list2.isEmpty()) {
                                return list;
                            }
                            List list3 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it8 = list3.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((mwg.g) it8.next()).f209461c);
                            }
                            if (zhm.d0.i1(arrayList).containsAll(list2)) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : list3) {
                                    if (listP.contains(((mwg.g) obj3).f209461c)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                return arrayList2;
                            }
                        }
                        return null;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        nvg.a0 a0Var = (nvg.a0) this.f300328b.f283493c;
                        eel.c timeSpan = params.f300489b;
                        String currency = params.d.f306286a;
                        List listP2 = uvl.c.p(params.e);
                        a0Var.getClass();
                        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter("LOCAL_PORTFOLIO_ID", "portfolioId");
                        List list4 = listP2;
                        List<pvg.u> listE = (list4 == null || list4.isEmpty()) ? a0Var.e(timeSpan, currency) : a0Var.d(timeSpan, currency, listP2);
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(listE, 10));
                        for (pvg.u uVar : listE) {
                            Intrinsics.checkNotNullParameter(uVar, "<this>");
                            arrayList3.add(new mwg.g(uVar.e, uVar.f, uVar.f240226g, hx7.a.v(uVar.f240227h)));
                        }
                        return arrayList3;
                }
            }
        };
        final int i6 = 1;
        this.d = new w4l.f(bVarK0, function1, function2, function12, new Function2(this) { // from class: wvg.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ uvl.c f300342b;

            {
                this.f300342b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                w0 params = (w0) obj2;
                List domain = (List) obj3;
                switch (i6) {
                    case 0:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = (ne0.j) this.f300342b.f283492b;
                        Collection collection = (List) jVar.get(uvl.c.x(params));
                        if (collection == null) {
                            collection = zhm.f0.f322471a;
                        }
                        ArrayList arrayListF1 = zhm.d0.f1(collection);
                        for (Object obj4 : domain) {
                            Iterator it8 = arrayListF1.iterator();
                            int i59 = 0;
                            while (true) {
                                if (it8.hasNext()) {
                                    if (!Intrinsics.f((mwg.g) it8.next(), (mwg.g) obj4)) {
                                        i59++;
                                    }
                                } else {
                                    i59 = -1;
                                }
                            }
                            if (i59 >= 0) {
                                arrayListF1.set(i59, obj4);
                            } else {
                                arrayListF1.add(obj4);
                            }
                        }
                        jVar.f(uvl.c.x(params), arrayListF1);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        nvg.a0 a0Var = (nvg.a0) this.f300342b.f283493c;
                        List<mwg.g> list = domain;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (mwg.g gVar : list) {
                            eel.c timeSpan = params.f300489b;
                            xi0.b currency = params.d;
                            Intrinsics.checkNotNullParameter(gVar, "<this>");
                            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                            Intrinsics.checkNotNullParameter(currency, "currency");
                            Intrinsics.checkNotNullParameter("LOCAL_PORTFOLIO_ID", "portfolioId");
                            arrayList.add(new pvg.u(timeSpan, currency.f306286a, "LOCAL_PORTFOLIO_ID", null, gVar.f209459a, gVar.f209460b, gVar.f209461c, hx7.a.A(gVar.d)));
                        }
                        a0Var.c(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public c(d4m.a chatDatabaseLazy, y10.h mapper, y20.h groupMergePlanner) {
        Intrinsics.checkNotNullParameter(chatDatabaseLazy, "chatDatabaseLazy");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(groupMergePlanner, "groupMergePlanner");
        this.f283491a = chatDatabaseLazy;
        this.f283492b = mapper;
        this.f283493c = groupMergePlanner;
        this.d = cim.b.a(new m(25), new m(26), new m(27));
    }

    public c(t1j.b portfolioRecurringOrdersInteractor, smd.s displayCurrencyConvertionInteractor, x8h.k displayCurrencyInteractor, woc.k recurringOrderApproximateMonthlyContributionCalculator, zjh.f roboPortfolioInteractor) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyConvertionInteractor, "displayCurrencyConvertionInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(recurringOrderApproximateMonthlyContributionCalculator, "recurringOrderApproximateMonthlyContributionCalculator");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        this.f283491a = portfolioRecurringOrdersInteractor;
        this.f283492b = displayCurrencyConvertionInteractor;
        this.f283493c = displayCurrencyInteractor;
        this.d = roboPortfolioInteractor;
    }
}
