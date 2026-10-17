package cpi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import bde.q;
import bde.r;
import com.google.common.base.Preconditions;
import com.ironz.binaryprefs.exception.EncryptionException;
import com.ironz.binaryprefs.exception.FileOperationException;
import com.revolut.domain.models.support.StateAfterReplacement;
import com.revolut.domain.models.support.TrackingChannel;
import com.revolut.domain.models.support.TroubleshootingCardDeliveryState;
import com.revolut.domain.models.support.TroubleshootingCardOwnerType;
import com.revolut.domain.models.support.TroubleshootingSource;
import com.revolut.feature.address.models.Address;
import ecm.j2;
import hcm.t;
import hcm.u;
import hcm.v;
import io.reactivex.exceptions.CompositeException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import le.u1;
import org.json.JSONException;
import org.json.JSONObject;
import qlm.e1;
import qlm.f1;
import qlm.o0;
import qlm.s;
import qlm.x0;
import rfm.z;
import wf0.x;
import yhm.m;
import zc.y;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements ak.a, cfm.b, lj.c, efm.d, f1, zc.n, efm.l, sri.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f107954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f107955c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f107953a = i;
        this.f107954b = obj2;
        this.f107955c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x0072, TryCatch #0 {IOException -> 0x0072, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cpi.g G(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L72
            mmm.m[] r0 = new mmm.m[r0]     // Catch: java.io.IOException -> L72
            mmm.h r1 = new mmm.h     // Catch: java.io.IOException -> L72
            r1.<init>()     // Catch: java.io.IOException -> L72
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L72
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L72
            java.lang.String[] r5 = q7.d.e     // Catch: java.io.IOException -> L72
            r6 = 34
            r1.w(r6)     // Catch: java.io.IOException -> L72
            int r7 = r4.length()     // Catch: java.io.IOException -> L72
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L72
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L72
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.C(r9, r8, r4)     // Catch: java.io.IOException -> L72
        L3d:
            r1.D(r10)     // Catch: java.io.IOException -> L72
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.C(r9, r7, r4)     // Catch: java.io.IOException -> L72
        L4a:
            r1.w(r6)     // Catch: java.io.IOException -> L72
            r1.readByte()     // Catch: java.io.IOException -> L72
            long r4 = r1.f207266b     // Catch: java.io.IOException -> L72
            mmm.m r4 = r1.c(r4)     // Catch: java.io.IOException -> L72
            r0[r3] = r4     // Catch: java.io.IOException -> L72
            int r3 = r3 + 1
            goto La
        L5b:
            cpi.g r1 = new cpi.g     // Catch: java.io.IOException -> L72
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L72
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L72
            mmm.e0 r2 = mmm.f0.Companion     // Catch: java.io.IOException -> L72
            r2.getClass()     // Catch: java.io.IOException -> L72
            mmm.f0 r0 = mmm.e0.b(r0)     // Catch: java.io.IOException -> L72
            r2 = 23
            r1.<init>(r12, r0, r2)     // Catch: java.io.IOException -> L72
            return r1
        L72:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cpi.g.G(java.lang.String[]):cpi.g");
    }

    public static String M(mmm.h hVar) {
        long j2 = hVar.f207266b;
        if (j2 <= 64) {
            return hVar.s().e();
        }
        return hVar.t((int) Math.min(j2, 64L)).e() + "...";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TroubleshootingSource N(String str) {
        switch (str.hashCode()) {
            case -763540635:
                if (str.equals("FEATURED_FAQ")) {
                    return TroubleshootingSource.FEATURED_FAQ;
                }
                break;
            case -155480518:
                if (str.equals("TROUBLESHOOTING")) {
                    return TroubleshootingSource.TROUBLESHOOTING;
                }
                break;
            case 835624813:
                if (str.equals("DEEP_LINK")) {
                    return TroubleshootingSource.DEEP_LINK;
                }
                break;
            case 956539024:
                if (str.equals("RULE_BASED")) {
                    return TroubleshootingSource.RULE_BASED;
                }
                break;
            case 1343807328:
                if (str.equals("SMART_FAQ")) {
                    return TroubleshootingSource.SMART_FAQ;
                }
                break;
        }
        return TroubleshootingSource.UNSUPPORTED;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static cpi.g g(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L28 java.lang.Error -> L2b java.io.IOException -> L2d
            cpi.g r2 = new cpi.g     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            r3 = 6
            r2.<init>(r5, r0, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L22 java.lang.Error -> L24 java.io.IOException -> L26
            return r2
        L22:
            r2 = move-exception
            goto L37
        L24:
            r2 = move-exception
            goto L37
        L26:
            r2 = move-exception
            goto L37
        L28:
            r2 = move-exception
        L29:
            r0 = r1
            goto L37
        L2b:
            r2 = move-exception
            goto L29
        L2d:
            r2 = move-exception
            goto L29
        L2f:
            r2 = move-exception
        L30:
            r5 = r1
            r0 = r5
            goto L37
        L33:
            r2 = move-exception
            goto L30
        L35:
            r2 = move-exception
            goto L30
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            if (r0 == 0) goto L41
            r0.release()     // Catch: java.io.IOException -> L41
        L41:
            if (r5 == 0) goto L46
            r5.close()     // Catch: java.io.IOException -> L46
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cpi.g.g(android.content.Context):cpi.g");
    }

    public static k8.c m(ImageDecoder.Source source, int i, int i2, c8.k kVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new k8.b(i, i2, kVar));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new k8.c((AnimatedImageDrawable) drawableDecodeDrawable, 3);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static Object v(Future future) {
        Object obj2;
        boolean z = false;
        while (true) {
            try {
                obj2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th10) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th10;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj2;
    }

    public static void y(String str, String str2, String str3) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.INFO;
        StringBuilder sbM = v0.a.m("Advertising Id is provided:", str2, "\nSource: ", str, "\nReason: ");
        sbM.append(str3);
        rd0.d.b(cVar, "AdvertisingIdProvider", sbM.toString(), null, null, 16);
    }

    public void A(u uVar, int i, icm.a aVar, mmm.m mVar) {
        if (x()) {
            Logger logger = (Logger) this.f107954b;
            Level level = (Level) this.f107955c;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(uVar);
            sb6.append(" GO_AWAY: lastStreamId=");
            sb6.append(i);
            sb6.append(" errorCode=");
            sb6.append(aVar);
            sb6.append(" length=");
            sb6.append(mVar.d());
            sb6.append(" bytes=");
            mmm.h hVar = new mmm.h();
            hVar.v(mVar);
            sb6.append(M(hVar));
            logger.log(level, sb6.toString());
        }
    }

    @Override // ak.a
    public boolean B() {
        try {
            v((Future) this.f107954b);
            return true;
        } catch (Exception e) {
            ((mj.a) this.f107955c).a(e);
            return false;
        }
    }

    public void C(u uVar, long j2) {
        if (x()) {
            ((Logger) this.f107954b).log((Level) this.f107955c, uVar + " PING: ack=false bytes=" + j2);
        }
    }

    public void D(u uVar, int i, icm.a aVar) {
        if (x()) {
            ((Logger) this.f107954b).log((Level) this.f107955c, uVar + " RST_STREAM: streamId=" + i + " errorCode=" + aVar);
        }
    }

    public void E(u uVar, icm.m mVar) {
        if (x()) {
            Logger logger = (Logger) this.f107954b;
            Level level = (Level) this.f107955c;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(uVar);
            sb6.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(v.class);
            for (v vVar : v.values()) {
                if (mVar.c(vVar.a())) {
                    enumMap.put(vVar, Integer.valueOf(((int[]) mVar.f160343b)[vVar.a()]));
                }
            }
            sb6.append(enumMap.toString());
            logger.log(level, sb6.toString());
        }
    }

    public void F(u uVar, int i, long j2) {
        if (x()) {
            ((Logger) this.f107954b).log((Level) this.f107955c, uVar + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j2);
        }
    }

    public ef.a H() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(o());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th10) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                    throw th10;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        ef.c cVar = ef.c.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", cVar.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = ef.a.f125241h;
        oe.c cVar2 = new oe.c();
        cVar2.f = 0L;
        cVar2.o(cVar);
        cVar2.e = 0L;
        cVar2.f224497a = strOptString;
        cVar2.o(ef.c.values()[iOptInt]);
        cVar2.f224499c = strOptString2;
        cVar2.d = strOptString3;
        cVar2.f = Long.valueOf(jOptLong);
        cVar2.e = Long.valueOf(jOptLong2);
        cVar2.f224500g = strOptString4;
        return cVar2.d();
    }

    public void I() {
        try {
            ((FileLock) this.f107955c).release();
            ((FileChannel) this.f107954b).close();
        } catch (IOException e) {
        }
    }

    public void J(ecm.a aVar, Object obj2) {
        if (((IdentityHashMap) this.f107955c) == null) {
            this.f107955c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f107955c).put(aVar, obj2);
    }

    public Intent K(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        List<ResolveInfo> listQueryIntentActivities = ((Context) this.f107955c).getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = listQueryIntentActivities;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((ResolveInfo) it8.next()).activityInfo.applicationInfo.packageName, "com.android.vending")) {
                    intent.setPackage("com.android.vending");
                    intent.addFlags(270532608);
                    return intent;
                }
            }
        }
        return new Intent("android.intent.action.VIEW", Uri.parse(str2));
    }

    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.util.Map] */
    public efm.k L(q dto) {
        bde.a aVar;
        String str;
        TrackingChannel trackingChannel;
        TrackingChannel trackingChannel2;
        StateAfterReplacement stateAfterReplacement;
        Intrinsics.checkNotNullParameter(dto, "dto");
        if (dto instanceof bde.a) {
            bde.a aVar2 = (bde.a) dto;
            TroubleshootingCardDeliveryState troubleshootingCardDeliveryState = (TroubleshootingCardDeliveryState) u1.v(aVar2.getPayload().getDeliveryState(), r0.k(new Pair("DELIVERED", TroubleshootingCardDeliveryState.DELIVERED), new Pair("UNTRACKED_ON_WAY", TroubleshootingCardDeliveryState.UNTRACKED_ON_WAY), new Pair("UNTRACKED_SHOULD_DELIVERED", TroubleshootingCardDeliveryState.UNTRACKED_SHOULD_DELIVERED), new Pair("BEING_POSTED", TroubleshootingCardDeliveryState.BEING_POSTED), new Pair("TRACKED_ON_WAY", TroubleshootingCardDeliveryState.TRACKED_ON_WAY), new Pair("TRACKED_SHOULD_DELIVERED", TroubleshootingCardDeliveryState.TRACKED_SHOULD_DELIVERED)));
            if (troubleshootingCardDeliveryState == null) {
                return rfm.h.f253943a;
            }
            String strB = aVar2.getPayload().getCardId();
            String strK = aVar2.getPayload().getName();
            b93.b bVar = new b93.b(aVar2.getPayload().getDesign());
            String strA = aVar2.getPayload().getBrand();
            String strJ = aVar2.getPayload().getLastFour();
            Address addressA = oo3.a.a(aVar2.getPayload().getDeliveryAddress());
            String strI = aVar2.getPayload().getEstimatedDeliveryDate();
            String strF = aVar2.getPayload().getDeliveryContact();
            String strD = aVar2.getPayload().getCourierCompany();
            String strN = aVar2.getPayload().getTrackingChannel();
            if (strN != null) {
                aVar = aVar2;
                str = strB;
                trackingChannel = (TrackingChannel) u1.v(strN, r0.k(new Pair("APP", TrackingChannel.APP), new Pair("SMS", TrackingChannel.SMS), new Pair("NONE", TrackingChannel.NONE)));
            } else {
                aVar = aVar2;
                str = strB;
                trackingChannel = null;
            }
            bde.p pVarM = aVar.getPayload().getTracking();
            d71.l lVarW = pVarM != null ? hx7.e.w(pVarM) : null;
            String strL = aVar.getPayload().getStateAfterReplacement();
            if (strL != null) {
                trackingChannel2 = trackingChannel;
                stateAfterReplacement = (StateAfterReplacement) u1.u(strL, r0.k(new Pair("LOST", StateAfterReplacement.LOST), new Pair("TERMINATED", StateAfterReplacement.TERMINATED)));
            } else {
                trackingChannel2 = trackingChannel;
                stateAfterReplacement = null;
            }
            return efm.k.g(new d71.a(N(aVar.getSource()), str, troubleshootingCardDeliveryState, strK, strA, strJ, bVar, addressA, strI, strF, strD, trackingChannel2, lVarW, stateAfterReplacement, (TroubleshootingCardOwnerType) u1.t(aVar.getPayload().getCardOwnerType(), TroubleshootingCardOwnerType.PERSONAL, this.f107955c)));
        }
        if (dto instanceof bde.k) {
            bde.k kVar = (bde.k) dto;
            String strC = kVar.getTitle();
            if (strC == null) {
                strC = kVar.getPayload().getHyperlink();
            }
            rfm.u uVarG = efm.k.g(new d71.g(N(kVar.getSource()), strC, kVar.getPayload().getHyperlink()));
            Intrinsics.checkNotNullExpressionValue(uVarG, "let(...)");
            return uVarG;
        }
        if (dto instanceof bde.g) {
            bde.g gVar = (bde.g) dto;
            String strD2 = gVar.getTitle();
            String strA2 = gVar.getPayload().getLink();
            r rVarA = gVar.getMetadata();
            String strB2 = rVarA != null ? rVarA.getTitleKey() : null;
            r rVarA2 = gVar.getMetadata();
            rfm.u uVarG2 = efm.k.g(new d71.e(N(gVar.getSource()), strD2, strA2, strB2, rVarA2 != null ? rVarA2.getActionKey() : null));
            Intrinsics.checkNotNullExpressionValue(uVarG2, "let(...)");
            return uVarG2;
        }
        if (dto instanceof bde.e) {
            bde.e eVar = (bde.e) dto;
            String strC2 = eVar.getTitle();
            TroubleshootingSource troubleshootingSourceN = N(eVar.getSource());
            String strC3 = eVar.getPayload().getContent();
            String strD3 = eVar.getPayload().getContentKey();
            List<bde.d> listA = eVar.getPayload().getActions();
            ArrayList arrayList = new ArrayList(w.t(listA, 10));
            for (bde.d dVar : listA) {
                arrayList.add(new d71.c(dVar.getActionKey(), dVar.getLink(), dVar.getTitle(), dVar.getPrimary()));
            }
            bde.c cVarB = eVar.getPayload().getCategory();
            rfm.u uVarG3 = efm.k.g(new d71.b(troubleshootingSourceN, strC2, strC3, strD3, arrayList, cVarB != null ? new d71.d(cVarB.getCategoryKey(), cVarB.getName(), cVarB.getIcon()) : null));
            Intrinsics.checkNotNullExpressionValue(uVarG3, "let(...)");
            return uVarG3;
        }
        if (!(dto instanceof bde.i)) {
            if (!(dto instanceof bde.m)) {
                throw new NoWhenBranchMatchedException();
            }
            bde.m mVar = (bde.m) dto;
            rfm.u uVarG4 = efm.k.g(new d71.h(N(mVar.getSource()), mVar.getTitle()));
            Intrinsics.checkNotNullExpressionValue(uVarG4, "let(...)");
            return uVarG4;
        }
        x xVar = (x) this.f107954b;
        String key = ((bde.i) dto).getPayload().getKey();
        Intrinsics.checkNotNullParameter(key, "key");
        xf0.a aVar3 = xVar.f296937a;
        wf0.m mVar2 = xVar.f296939c;
        efm.k kVarC = aVar3.c(key, mVar2.a());
        ufm.i iVarB = mVar2.b();
        int i = 2;
        wf0.r rVar = new wf0.r(i, new wf0.p(xVar, i));
        int i2 = 0;
        ufm.i iVar = new ufm.i(iVarB, rVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        int i3 = 1;
        efm.r rVarStartWith = iVar.x().concatMap(new w4l.c(new wf0.p(xVar, i2), 27)).doOnNext(new w4l.c(new wf0.p(xVar, i3), 28)).map(new w4l.c(new wd3.a(17), 29)).distinct().startWith((efm.w) new wf0.q(xVar, i2));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.k kVarFirstElement = rVarStartWith.skipWhile(new wf0.r(8, new wd3.a(22))).firstElement();
        w4l.c cVar = new w4l.c(new w38.v(xVar, key, 25), 26);
        kVarFirstElement.getClass();
        z zVarM = kVarC.m(new rfm.m(kVarFirstElement, cVar, i2));
        wf0.v vVar = wf0.v.f;
        rfm.m mVar3 = new rfm.m(zVarM, new vf0.q(), i3);
        Intrinsics.checkNotNullExpressionValue(mVar3, "map(...)");
        rfm.m mVar4 = new rfm.m(te0.w.h0(mVar3), new a9j.j(new acb.f(dto, this, 5), 12), i3);
        Intrinsics.checkNotNullExpressionValue(mVar4, "map(...)");
        return mVar4;
    }

    public void O(jk.c response) {
        Intrinsics.checkNotNullParameter(response, "response");
        synchronized (this) {
            ik.c cVar = (ik.c) this.f107954b;
            cVar.f161864a.edit().putLong("com.lyft.kronos.cached_current_time", response.f175020a).apply();
            ik.c cVar2 = (ik.c) this.f107954b;
            cVar2.f161864a.edit().putLong("com.lyft.kronos.cached_elapsed_time", response.f175021b).apply();
            ik.c cVar3 = (ik.c) this.f107954b;
            cVar3.f161864a.edit().putLong("com.lyft.kronos.cached_offset", response.f175022c).apply();
            Unit unit = Unit.f186387a;
        }
    }

    public byte[] P(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            byte b4 = bArr[i];
            for (byte b5 : (byte[]) this.f107954b) {
                b4 = (byte) (b4 ^ b5);
            }
            bArr2[i] = b4;
        }
        return bArr2;
    }

    @Override // zc.o
    public Object a() {
        return new rc.f((Context) ((uqi.b) this.f107954b).a(), (y) ((zc.m) this.f107955c).a(), new qf.b(13));
    }

    @Override // sri.f
    public boolean b() {
        return true;
    }

    @Override // ak.a
    public Object c(Object obj2) {
        try {
            return v((Future) this.f107954b);
        } catch (Exception e) {
            ((mj.a) this.f107955c).a(e);
            return obj2;
        }
    }

    @Override // lj.c
    public String d(String str) {
        lj.d dVar = (lj.d) this.f107955c;
        dVar.getClass();
        byte[] bytes = str.getBytes(lj.d.f);
        dVar.f195583a = null;
        dVar.f195584b = 0;
        dVar.d = 0;
        dVar.f195585c = false;
        if (bytes != null && bytes.length != 0) {
            dVar.b(bytes.length, bytes);
            dVar.b(-1, bytes);
            int i = dVar.f195584b;
            byte[] bArr = new byte[i];
            byte[] bArr2 = dVar.f195583a;
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr, 0, i);
                dVar.f195583a = null;
            }
            bytes = bArr;
        }
        return new String(P(bytes));
    }

    @Override // sri.f
    public Fragment e(String className, ClassLoader classLoader, String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f107955c;
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        String strConcat = str == null ? className : className.concat(str);
        WeakReference weakReference = (WeakReference) linkedHashMap.get(strConcat);
        Fragment fragment = weakReference != null ? (Fragment) weakReference.get() : null;
        if (fragment != null) {
            return fragment;
        }
        Fragment fragmentInstantiate = ((FragmentFactory) this.f107954b).instantiate(classLoader, className);
        Intrinsics.checkNotNullExpressionValue(fragmentInstantiate, "instantiate(...)");
        linkedHashMap.put(strConcat, new WeakReference(fragmentInstantiate));
        return fragmentInstantiate;
    }

    public void f(yem.k kVar) {
        ((ConcurrentHashMap) this.f107954b).put(((cfm.a) this.f107955c).d(kVar), kVar);
    }

    public ecm.b h() {
        if (((IdentityHashMap) this.f107955c) != null) {
            for (Map.Entry entry : ((ecm.b) this.f107954b).f124780a.entrySet()) {
                if (!((IdentityHashMap) this.f107955c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f107955c).put((ecm.a) entry.getKey(), entry.getValue());
                }
            }
            this.f107954b = new ecm.b((IdentityHashMap) this.f107955c);
            this.f107955c = null;
        }
        return (ecm.b) this.f107954b;
    }

    @Override // ak.a
    public void i() {
        try {
            v((Future) this.f107954b);
        } catch (Exception e) {
            throw new FileOperationException(e);
        }
    }

    @Override // lj.c
    public String j(String str) {
        byte[] bArrP = P(str.getBytes());
        lj.d dVar = (lj.d) this.f107955c;
        dVar.f195583a = null;
        dVar.f195584b = 0;
        dVar.d = 0;
        dVar.f195585c = false;
        if (bArrP.length != 0) {
            dVar.c(bArrP, bArrP.length);
            dVar.c(bArrP, -1);
            int i = dVar.f195584b;
            byte[] bArr = new byte[i];
            byte[] bArr2 = dVar.f195583a;
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr, 0, i);
                dVar.f195583a = null;
            }
            bArrP = bArr;
        }
        return new String(bArrP, lj.d.f);
    }

    public void k() {
        ((j2) this.f107954b).f124828b = true;
        ((ScheduledFuture) this.f107955c).cancel(false);
    }

    public void l() {
        String str = (String) this.f107954b;
        try {
            oe.c cVar = (oe.c) this.f107955c;
            cVar.getClass();
            new File((File) cVar.f224499c, str).createNewFile();
        } catch (IOException e) {
            "Error creating marker: ".concat(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    public ArrayList n() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        ce.e eVar = (ce.e) this.f107955c;
        Context context = (Context) this.f107954b;
        Class cls = eVar.f23289a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    String str = cls + " has no service info.";
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new ce.d((String) it8.next(), 0));
        }
        return arrayList2;
    }

    public File o() {
        if (((File) this.f107954b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f107954b) == null) {
                        pd.g gVar = (pd.g) this.f107955c;
                        gVar.a();
                        this.f107954b = new File(gVar.f235023a.getFilesDir(), "PersistedInstallation." + ((pd.g) this.f107955c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f107954b;
    }

    @Override // efm.d
    public void onComplete() {
        switch (this.f107953a) {
            case 22:
                ((efm.d) this.f107954b).onComplete();
                break;
            default:
                ((efm.l) this.f107954b).onComplete();
                break;
        }
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        switch (this.f107953a) {
            case 22:
                efm.d dVar = (efm.d) this.f107954b;
                try {
                    if (!((kfm.p) ((pfm.a) this.f107955c).f235715c).test(th10)) {
                        dVar.onError(th10);
                    } else {
                        dVar.onComplete();
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    dVar.onError(new CompositeException(th10, th11));
                    return;
                }
                break;
            default:
                ((efm.l) this.f107954b).onError(th10);
                break;
        }
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        switch (this.f107953a) {
            case 22:
                ((efm.d) this.f107954b).onSubscribe(cVar);
                break;
            default:
                lfm.d.e((ofm.h) this.f107955c, cVar);
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        ((efm.l) this.f107954b).onSuccess(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cpi.g.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ak.a
    public Object q() {
        try {
            return v((Future) this.f107954b);
        } catch (Exception e) {
            throw new FileOperationException(e);
        }
    }

    public synchronized List r(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f107954b).contains(str)) {
                ((ArrayList) this.f107954b).add(str);
            }
            arrayList = (List) ((HashMap) this.f107955c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f107955c).put(str, arrayList);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return arrayList;
    }

    public synchronized ArrayList s(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it8 = ((ArrayList) this.f107954b).iterator();
        while (it8.hasNext()) {
            List<t8.c> list = (List) ((HashMap) this.f107955c).get((String) it8.next());
            if (list != null) {
                for (t8.c cVar : list) {
                    if ((cVar.f268753a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f268754b)) && !arrayList.contains(cVar.f268754b)) {
                        arrayList.add(cVar.f268754b);
                    }
                }
            }
        }
        return arrayList;
    }

    public Intent t(String str) {
        yf.c cVar = (yf.c) this.f107954b;
        if (str == null) {
            str = ((Context) this.f107955c).getPackageName();
        }
        Intrinsics.h(str);
        return K(cVar.d(str), cVar.e(str));
    }

    public Intent u(ui0.b appInStore) {
        Intrinsics.checkNotNullParameter(appInStore, "appInStore");
        yf.c cVar = (yf.c) this.f107954b;
        String strA = appInStore.a();
        return K(cVar.d(strA), cVar.e(strA));
    }

    public void w(ef.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f125242a);
            jSONObject.put("Status", aVar.f125243b.ordinal());
            jSONObject.put("AuthToken", aVar.f125244c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f);
            jSONObject.put("ExpiresInSecs", aVar.e);
            jSONObject.put("FisError", aVar.f125245g);
            pd.g gVar = (pd.g) this.f107955c;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f235023a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(o())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean x() {
        return ((Logger) this.f107954b).isLoggable((Level) this.f107955c);
    }

    public void z(u uVar, int i, mmm.h hVar, int i2, boolean z) {
        if (x()) {
            ((Logger) this.f107954b).log((Level) this.f107955c, uVar + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + M(hVar));
        }
    }

    public g(uqi.b bVar, zc.m mVar, dfm.c cVar) {
        this.f107953a = 26;
        this.f107954b = bVar;
        this.f107955c = mVar;
    }

    public g(int i) {
        this.f107953a = i;
        switch (i) {
            case 13:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(t.class.getName());
                this.f107955c = (Level) Preconditions.checkNotNull(level, "level");
                this.f107954b = (Logger) Preconditions.checkNotNull(logger, "logger");
                break;
            case 29:
                this.f107954b = new ArrayList();
                this.f107955c = new HashMap();
                break;
            default:
                this.f107954b = new HashMap();
                this.f107955c = new HashMap();
                break;
        }
    }

    @Override // qlm.f1
    public Object a(KClass key, ArrayList types) {
        Object objA;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj2 = ((s) this.f107955c).get(nim.a.o(key));
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        x0 x0Var = (x0) obj2;
        Object objA2 = x0Var.f247725a.get();
        if (objA2 == null) {
            objA2 = x0Var.a(new qlm.r());
        }
        e1 e1Var = (e1) objA2;
        ArrayList arrayList = new ArrayList(w.t(types, 10));
        Iterator it8 = types.iterator();
        while (it8.hasNext()) {
            arrayList.add(new o0((KType) it8.next()));
        }
        ConcurrentHashMap concurrentHashMap = e1Var.f247636a;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                m.Companion aVar = yhm.m.INSTANCE;
                objA = (KSerializer) ((Function2) this.f107954b).invoke(key, types);
            } catch (Throwable th10) {
                m.Companion aVar2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
            yhm.m mVar = new yhm.m(objA);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, mVar);
            obj3 = objPutIfAbsent == null ? mVar : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "getOrPut(...)");
        return ((yhm.m) obj3).f314193a;
    }

    public g(lm.c contextAccessor, ip.b defaultUiConfiguration) {
        this.f107953a = 0;
        Intrinsics.checkNotNullParameter(contextAccessor, "contextAccessor");
        Intrinsics.checkNotNullParameter(defaultUiConfiguration, "defaultUiConfiguration");
        this.f107954b = contextAccessor;
        this.f107955c = defaultUiConfiguration;
    }

    public g(yf.c uriFactory, Context context) {
        this.f107953a = 24;
        Intrinsics.checkNotNullParameter(uriFactory, "uriFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f107954b = uriFactory;
        this.f107955c = context;
    }

    public g(nh0.b advertisingIdClient, rh0.b availabilityManager, i90.b uuidUtils) {
        this.f107953a = 20;
        Intrinsics.checkNotNullParameter(advertisingIdClient, "advertisingIdClient");
        Intrinsics.checkNotNullParameter(availabilityManager, "availabilityManager");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f107954b = advertisingIdClient;
        this.f107955c = uuidUtils;
    }

    public g(ik.c syncResponseCache, dfm.c deviceClock) {
        this.f107953a = 15;
        Intrinsics.checkNotNullParameter(syncResponseCache, "syncResponseCache");
        Intrinsics.checkNotNullParameter(deviceClock, "deviceClock");
        this.f107954b = syncResponseCache;
        this.f107955c = deviceClock;
    }

    public g(byte[] bArr) {
        this.f107953a = 17;
        this.f107954b = bArr;
        this.f107955c = new lj.d();
        if (bArr.length >= 16) {
            if (bArr.length % 2 == 0) {
                int length = bArr.length / 2;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length, bArr.length);
                Arrays.sort(bArrCopyOfRange);
                Arrays.sort(bArrCopyOfRange2);
                if (Arrays.equals(bArrCopyOfRange, bArrCopyOfRange2)) {
                    throw new EncryptionException("XOR must not be mirrored");
                }
                return;
            }
            return;
        }
        throw new EncryptionException("XOR must be at least 16 bytes");
    }

    public g(String str, Map map) {
        this.f107953a = 18;
        this.f107955c = new Handler(Looper.getMainLooper());
        List listSynchronizedList = (List) map.get(str);
        if (listSynchronizedList == null) {
            listSynchronizedList = Collections.synchronizedList(new ArrayList());
            map.put(str, listSynchronizedList);
        }
        this.f107954b = listSynchronizedList;
    }

    public g(FragmentFactory factory) {
        this.f107953a = 28;
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f107954b = factory;
        this.f107955c = new LinkedHashMap();
    }

    public g(x faqRepository) {
        this.f107953a = 1;
        Intrinsics.checkNotNullParameter(faqRepository, "faqRepository");
        this.f107954b = faqRepository;
        this.f107955c = r0.k(new Pair("PERSONAL", TroubleshootingCardOwnerType.PERSONAL), new Pair("YOUTH", TroubleshootingCardOwnerType.JUNIOR));
    }

    public g(pfm.a aVar, efm.d dVar) {
        this.f107953a = 22;
        this.f107955c = aVar;
        this.f107954b = dVar;
    }

    public g(cf.b bVar) {
        this.f107953a = 2;
        this.f107955c = Collections.synchronizedMap(new HashMap());
        this.f107954b = bVar;
    }

    public g(cfm.a aVar) {
        this.f107953a = 5;
        this.f107954b = new ConcurrentHashMap();
        this.f107955c = aVar;
    }

    public g(pd.g gVar) {
        this.f107953a = 10;
        this.f107955c = gVar;
    }

    public g(ao.h hVar) {
        this.f107953a = 11;
        Context context = (Context) hVar.f7847b;
        int iD = ie.g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f107954b = "Unity";
            String string = context.getResources().getString(iD);
            this.f107955c = string;
            j6.a.q("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f107954b = "Flutter";
                this.f107955c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    return;
                } else {
                    return;
                }
            } catch (IOException unused) {
            }
        }
        this.f107954b = null;
        this.f107955c = null;
    }

    public g(Function2 compute) {
        this.f107953a = 25;
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f107954b = compute;
        this.f107955c = new s();
    }

    public g(ecm.b bVar) {
        this.f107953a = 8;
        this.f107954b = bVar;
    }

    public g(j2 j2Var, ScheduledFuture scheduledFuture) {
        this.f107953a = 9;
        this.f107954b = (j2) Preconditions.checkNotNull(j2Var, "runnable");
        this.f107955c = (ScheduledFuture) Preconditions.checkNotNull(scheduledFuture, "future");
    }
}
