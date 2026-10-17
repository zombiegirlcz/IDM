package lr;

import android.graphics.Rect;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationScansService;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationService;
import com.revolut.camerakit.core.camerax.extras.model.ResultInternal;
import e10.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import kr.b2;
import kr.c0;
import kr.c3;
import kr.e2;
import kr.f0;
import kr.f3;
import kr.g1;
import kr.i0;
import kr.j1;
import kr.k2;
import kr.m1;
import kr.n2;
import kr.o0;
import kr.p0;
import kr.p2;
import kr.q2;
import kr.r;
import kr.r0;
import kr.s0;
import kr.s1;
import kr.t0;
import kr.t2;
import kr.u0;
import kr.v0;
import kr.v1;
import kr.w0;
import kr.w2;
import kr.x0;
import kr.y0;
import kr.y1;
import kr.z;
import kr.z2;
import nkm.y;
import nq.l0;
import nq.t;
import nq.v;
import nq.w;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import r00.e;
import ulm.a1;
import ulm.b1;
import ulm.o1;
import ulm.p1;
import vkm.q;
import xv.u;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes17.dex */
public final class p {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationService f199356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationScansService f199357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tr.e f199358c;
    public final cr.d d;
    public final rlm.o e;

    public p(BiometricVerificationService mainService, BiometricVerificationScansService scansService, tr.e randomBytesProvider, a defferedUploadVerificationTokenRepository, cr.d deviceFingerprintPayloadMapper, rlm.o json) {
        Intrinsics.checkNotNullParameter(mainService, "mainService");
        Intrinsics.checkNotNullParameter(scansService, "scansService");
        Intrinsics.checkNotNullParameter(randomBytesProvider, "randomBytesProvider");
        Intrinsics.checkNotNullParameter(defferedUploadVerificationTokenRepository, "defferedUploadVerificationTokenRepository");
        Intrinsics.checkNotNullParameter(deviceFingerprintPayloadMapper, "deviceFingerprintPayloadMapper");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f199356a = mainService;
        this.f199357b = scansService;
        this.f199358c = randomBytesProvider;
        this.d = deviceFingerprintPayloadMapper;
        this.e = json;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final j a(p pVar, Map map, String str) throws IOException {
        Flow flowE;
        Iterator it8;
        y0 x0Var;
        byte[] bArrArray;
        byte[] bArrArray2;
        float[] fArrArray;
        y0 r0Var;
        Iterator it9;
        r rVar;
        vw.j jVar;
        Iterator it10;
        long jLongValue;
        byte[] bArrArray3;
        String str2;
        int i;
        v1 v1Var;
        s sVar;
        p pVar2 = pVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        Iterator it11 = map.entrySet().iterator();
        while (it11.hasNext()) {
            Map.Entry entry = (Map.Entry) it11.next();
            Object key = entry.getKey();
            t tVar = (t) entry.getValue();
            rlm.o json = pVar2.e;
            Intrinsics.checkNotNullParameter(tVar, "<this>");
            Intrinsics.checkNotNullParameter(json, "json");
            if (tVar instanceof nq.n) {
                nq.n nVar = (nq.n) tVar;
                ByteBuffer byteBuffer = nVar.f218320b;
                if (byteBuffer.hasArray()) {
                    bArrArray3 = byteBuffer.array();
                } else {
                    byteBuffer.clear();
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    bArrArray3 = bArr;
                }
                p1 p1Var = RequestBody.Companion;
                Intrinsics.h(bArrArray3);
                b1.Companion.getClass();
                o1 o1VarD = p1.d(p1Var, bArrArray3, a1.b("image/jpeg"), 0, 6);
                v vVar = nVar.f218319a;
                Intrinsics.checkNotNullParameter(vVar, "<this>");
                String strA = vVar.f218332a.a();
                List list = vVar.f218333b;
                float f = vVar.f218334c;
                int i2 = vVar.d;
                String str3 = vVar.e;
                ResultInternal resultInternal = vVar.f;
                Map mapH = resultInternal != null ? jb3.l.h(resultInternal) : null;
                it8 = it11;
                Boolean boolValueOf = vVar.f218332a == w.DOCUMENT_FRONT ? Boolean.valueOf(vVar.f218335g) : null;
                String str4 = vVar.f218336h;
                Integer num = vVar.i;
                Iterable iterable = vVar.f218337j;
                Intrinsics.checkNotNullParameter(iterable, "<this>");
                e10.l lVar = (e10.l) y.r(y.z(y.n(d0.Q(iterable), fr.a.f137312a), new h0() { // from class: fr.b
                    @Override // kotlin.jvm.internal.h0, wim.p
                    public final Object get(Object obj2) {
                        return ((e) obj2).a();
                    }
                }));
                if (lVar == null || (sVar = lVar.f121819a) == null) {
                    str2 = str4;
                    i = i2;
                    v1Var = null;
                } else {
                    str2 = str4;
                    i = i2;
                    v1Var = new v1(new s1(zhm.v.k(knm.b.O(sVar.f121837a, "dark"), knm.b.O(sVar.f121838b, "darkContour"), knm.b.O(sVar.f121839c, "bright"), knm.b.O(sVar.d, "blur"), knm.b.O(sVar.e, "glare"), knm.b.O(sVar.f, "colorized"), knm.b.O(sVar.f121840g, "fraud"), knm.b.O(sVar.f121841h, "leftEye"), knm.b.O(sVar.i, "rightEye"), knm.b.O(sVar.f121842j, "occluded"), knm.b.O(sVar.k, "sunglasses"))));
                }
                x0Var = new u0(o1VarD, new j1(strA, new g1(list, f, i, str3, mapH, boolValueOf, str2, num, v1Var)));
            } else {
                it8 = it11;
                if (tVar instanceof nq.r) {
                    nq.r rVar2 = (nq.r) tVar;
                    vw.o oVar = rVar2.f218328b;
                    b1.Companion.getClass();
                    b1 b1VarB = a1.b("video/mp4");
                    oVar.getClass();
                    vw.n nVar2 = new vw.n(b1VarB, oVar);
                    String strF = oVar.f();
                    l0 l0Var = rVar2.f218327a;
                    Intrinsics.checkNotNullParameter(l0Var, "<this>");
                    String strA2 = l0Var.f218310a.a();
                    String str5 = l0Var.f218312c;
                    List list2 = l0Var.d;
                    long j2 = l0Var.e;
                    String str6 = l0Var.f;
                    Integer num2 = l0Var.f218313g;
                    int i3 = l0Var.f218314h;
                    String str7 = l0Var.i;
                    boolean z = l0Var.f218315j;
                    String str8 = l0Var.f218311b;
                    String str9 = l0Var.k;
                    ResultInternal resultInternal2 = l0Var.f218316l;
                    x0Var = new w0(nVar2, strF, new t2(strA2, new e2(str5, list2, j2, str6, num2, i3, str7, z, str8, str9, resultInternal2 != null ? jb3.l.h(resultInternal2) : null, l0Var.f218317m, l0Var.f218318n, l0Var.o)));
                } else {
                    String str10 = "application/json";
                    if (tVar instanceof nq.l) {
                        nq.l lVar2 = (nq.l) tVar;
                        vw.m mVar = lVar2.f218307a;
                        Intrinsics.checkNotNullParameter(mVar, "<this>");
                        String str11 = mVar.f292604a;
                        ArrayList arrayList = mVar.e;
                        vw.h hVar = mVar.f;
                        ArrayList arrayList2 = hVar.f292591c;
                        p2 p2Var = arrayList2.isEmpty() ? p2.UNAVAILABLE : (arrayList.isEmpty() || (jVar = mVar.f292605b) == vw.j.PARTIAL) ? p2.PARTIAL : jVar == vw.j.UNAVAILABLE ? p2.UNAVAILABLE : p2.COMPLETED;
                        long j3 = mVar.f292606c;
                        p2 p2Var2 = p2Var;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it12 = arrayList.iterator();
                        while (it12.hasNext()) {
                            vw.k kVar = (vw.k) it12.next();
                            int i5 = fr.c.f137313a[mVar.d.ordinal()];
                            vw.m mVar2 = mVar;
                            if (i5 == 1) {
                                it10 = it12;
                                jLongValue = kVar.f292602b.longValue();
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                it10 = it12;
                                jLongValue = kVar.f292603c;
                            }
                            arrayList3.add(Long.valueOf(jLongValue));
                            it12 = it10;
                            mVar = mVar2;
                        }
                        double d = hVar.f292589a;
                        Double d5 = hVar.f292590b;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList2, 10));
                        Iterator it13 = arrayList2.iterator();
                        while (it13.hasNext()) {
                            arrayList4.add(new n2(((vw.i) it13.next()).f292592a, r11.f292593b, r11.f292594c, r11.d, r11.e, r11.f, r11.f292595g, r11.f292596h, r11.i, r11.f292597j, r11.k, r11.f292598l, r11.f292599m, r11.f292600n));
                            it13 = it13;
                            str10 = str10;
                        }
                        q2 q2Var = new q2(str11, p2Var2, j3, arrayList3, new k2(d, d5, arrayList4));
                        p1 p1Var2 = RequestBody.Companion;
                        String strC = json.c(q2.Companion.serializer(), q2Var);
                        b1.Companion.getClass();
                        b1 b1VarB2 = a1.b(str10);
                        p1Var2.getClass();
                        x0Var = new t0(p1.b(strC, b1VarB2), new o0(w.IMU_DATA.a(), new kr.l0(new i0(p2Var2.name()), lVar2.f218308b, lVar2.f218309c)));
                    } else {
                        if (tVar instanceof nq.k) {
                            nq.k kVar2 = (nq.k) tVar;
                            List list3 = kVar2.f218304a;
                            ArrayList arrayList5 = new ArrayList(zhm.w.t(list3, 10));
                            Iterator it14 = list3.iterator();
                            while (it14.hasNext()) {
                                gv.g gVar = (gv.g) it14.next();
                                long j5 = gVar.f147007a;
                                int i6 = gVar.f147008b;
                                int i21 = gVar.f147009c;
                                gv.f fVar = gVar.d;
                                if (fVar != null) {
                                    it9 = it14;
                                    rVar = new r(fVar.f147004a, fVar.f147005b, fVar.f147006c, fVar.d);
                                } else {
                                    it9 = it14;
                                    rVar = null;
                                }
                                gv.p pVar3 = gVar.e;
                                arrayList5.add(new z(j5, i6, i21, rVar, pVar3 != null ? new m1(pVar3.f147029a, pVar3.f147030b, pVar3.f147031c, pVar3.d, pVar3.e, pVar3.f, pVar3.f147032g, pVar3.f147033h, pVar3.i, pVar3.f147034j, pVar3.k) : null));
                                it14 = it9;
                            }
                            kr.w wVar = new kr.w(arrayList5);
                            p1 p1Var3 = RequestBody.Companion;
                            String strC2 = json.c(kr.w.Companion.serializer(), wVar);
                            b1.Companion.getClass();
                            b1 b1VarB3 = a1.b("application/json");
                            p1Var3.getClass();
                            o1 o1VarB = p1.b(strC2, b1VarB3);
                            String strA3 = w.REV_VISION_TELEMETRY.a();
                            gv.o oVar2 = kVar2.f218305b;
                            r0Var = new s0(o1VarB, new f0(strA3, new c0(new kr.b1(oVar2.f147027a, oVar2.f147028b), kVar2.f218306c, kVar2.d)));
                        } else if (tVar instanceof nq.h) {
                            nq.h hVar2 = (nq.h) tVar;
                            FloatBuffer floatBuffer = hVar2.f218299b;
                            if (floatBuffer.hasArray()) {
                                fArrArray = floatBuffer.array();
                            } else {
                                floatBuffer.clear();
                                float[] fArr = new float[floatBuffer.remaining()];
                                floatBuffer.get(fArr);
                                fArrArray = fArr;
                            }
                            p1 p1Var4 = RequestBody.Companion;
                            String strC3 = json.c(nlm.a.c(qlm.d0.f247628c), fArrArray);
                            b1.Companion.getClass();
                            b1 b1VarB4 = a1.b("application/json");
                            p1Var4.getClass();
                            o1 o1VarB2 = p1.b(strC3, b1VarB4);
                            nq.f fVar2 = hVar2.f218298a;
                            r0Var = new r0(o1VarB2, new kr.t(new kr.s(fVar2.f218290b, fVar2.f218291c), 1));
                        } else if (tVar instanceof nq.p) {
                            p1 p1Var5 = RequestBody.Companion;
                            nq.p pVar4 = (nq.p) tVar;
                            byte[] bArr2 = pVar4.f218326c;
                            b1.Companion.getClass();
                            x0Var = new v0(p1.d(p1Var5, bArr2, a1.b("image/jpeg"), 0, 6), new b2(w.VALIDITY_CHECK.a(), new y1(pVar4.e, pVar4.f218324a, pVar4.f218325b.a(), pVar4.d)));
                        } else if (tVar instanceof nq.g) {
                            p1 p1Var6 = RequestBody.Companion;
                            nq.g gVar2 = (nq.g) tVar;
                            ByteBuffer byteBufferDuplicate = gVar2.f218294a.duplicate();
                            byteBufferDuplicate.rewind();
                            byte[] bArr3 = new byte[byteBufferDuplicate.remaining()];
                            byteBufferDuplicate.get(bArr3);
                            b1.Companion.getClass();
                            x0Var = new kr.q0(p1.d(p1Var6, bArr3, a1.b("image/jpeg"), 0, 6), new kr.o(new kr.n(1, gVar2.f218295b, gVar2.f218296c), 1));
                        } else if (tVar instanceof nq.o) {
                            nq.o oVar3 = (nq.o) tVar;
                            nq.a aVar = oVar3.f218321a;
                            ByteBuffer byteBuffer2 = oVar3.f218322b;
                            if (byteBuffer2.hasArray()) {
                                bArrArray2 = byteBuffer2.array();
                            } else {
                                byteBuffer2.clear();
                                byte[] bArr4 = new byte[byteBuffer2.remaining()];
                                byteBuffer2.get(bArr4);
                                bArrArray2 = bArr4;
                            }
                            Intrinsics.h(bArrArray2);
                            p1 p1Var7 = RequestBody.Companion;
                            b1.Companion.getClass();
                            o1 o1VarD2 = p1.d(p1Var7, bArrArray2, a1.b("image/png"), 0, 6);
                            String strA4 = w.FACE_CROP.a();
                            Map map2 = aVar.f218280b;
                            x0Var = new p0(o1VarD2, new kr.d(strA4, new kr.a((map2 == null || map2.isEmpty()) ? null : map2, aVar.f218281c, aVar.d)));
                        } else if (tVar instanceof nq.j) {
                            nq.j jVar2 = (nq.j) tVar;
                            nq.a aVar2 = jVar2.f218302a;
                            ByteBuffer byteBuffer3 = jVar2.f218303b;
                            if (byteBuffer3.hasArray()) {
                                bArrArray = byteBuffer3.array();
                            } else {
                                byteBuffer3.clear();
                                byte[] bArr5 = new byte[byteBuffer3.remaining()];
                                byteBuffer3.get(bArr5);
                                bArrArray = bArr5;
                            }
                            Intrinsics.h(bArrArray);
                            p1 p1Var8 = RequestBody.Companion;
                            b1.Companion.getClass();
                            o1 o1VarD3 = p1.d(p1Var8, bArrArray, a1.b("image/png"), 0, 6);
                            String strA5 = w.SELFIE.a();
                            Map map3 = aVar2.f218280b;
                            x0Var = new p0(o1VarD3, new kr.d(strA5, new kr.a((map3 == null || map3.isEmpty()) ? null : map3, aVar2.f218281c, aVar2.d)));
                        } else {
                            if (!(tVar instanceof nq.s)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            nq.s sVar2 = (nq.s) tVar;
                            u uVar = sVar2.f218329a;
                            p1 p1Var9 = RequestBody.Companion;
                            ArrayList arrayList6 = uVar.f;
                            ArrayList parts = new ArrayList(zhm.w.t(arrayList6, 10));
                            Iterator it15 = arrayList6.iterator();
                            while (it15.hasNext()) {
                                parts.add(((xv.t) it15.next()).f309137a);
                            }
                            Intrinsics.checkNotNullParameter(parts, "parts");
                            Iterator it16 = parts.iterator();
                            int length = 0;
                            while (it16.hasNext()) {
                                length += ((byte[]) it16.next()).length;
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(length / 2, 1024));
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                Iterator it17 = parts.iterator();
                                while (it17.hasNext()) {
                                    gZIPOutputStream.write((byte[]) it17.next());
                                }
                                Unit unit = Unit.f186387a;
                                gZIPOutputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                                b1.Companion.getClass();
                                o1 o1VarD4 = p1.d(p1Var9, byteArray, a1.b("application/gzip"), 0, 6);
                                String strA6 = w.YUV_DATA.a();
                                int i22 = uVar.f309140a;
                                int i32 = uVar.f309141b;
                                int i33 = uVar.d;
                                Rect rect = uVar.f309142c;
                                f3 f3Var = new f3(rect.left, rect.top, rect.right, rect.bottom);
                                long j16 = uVar.e;
                                ArrayList arrayList7 = uVar.f;
                                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                                for (Iterator it18 = arrayList7.iterator(); it18.hasNext(); it18 = it18) {
                                    xv.t tVar2 = (xv.t) it18.next();
                                    arrayList8.add(new c3(tVar2.f309138b, tVar2.f309139c, tVar2.d, tVar2.e, tVar2.f309137a.length));
                                }
                                x0Var = new x0(o1VarD4, new z2(strA6, new w2(i22, i32, i33, f3Var, j16, arrayList8, sVar2.f218330b, sVar2.f218331c)));
                            } finally {
                            }
                        }
                        x0Var = r0Var;
                    }
                }
            }
            linkedHashMap.put(key, x0Var);
            pVar2 = pVar;
            it11 = it8;
        }
        Iterator it19 = linkedHashMap.values().iterator();
        long jContentLength = 0;
        while (it19.hasNext()) {
            jContentLength += ((y0) it19.next()).a().contentLength();
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList9 = new ArrayList(zhm.w.t(setEntrySet, 10));
        for (Map.Entry entry2 : setEntrySet) {
            y0 y0Var = (y0) entry2.getValue();
            if (y0Var instanceof u0) {
                flowE = t1.E(q.k(new fc0.e(y0Var, pVar, str, (String) entry2.getKey(), (Continuation) null, 25)));
            } else if (y0Var instanceof w0) {
                flowE = t1.E(q.k(new fc0.e(y0Var, pVar, str, (String) entry2.getKey(), (Continuation) null, 27)));
            } else if (y0Var instanceof t0) {
                t0 t0Var = (t0) y0Var;
                flowE = t1.E(q.k(new ac8.h(14, "imu_data.json", t0Var.f188581a, new lea.b(pVar, t0Var, 23), pVar, str, (String) entry2.getKey(), (Continuation) null)));
            } else if (y0Var instanceof s0) {
                s0 s0Var = (s0) y0Var;
                flowE = t1.E(q.k(new ac8.h(14, (Object) null, s0Var.f188574a, new lea.b(pVar, s0Var, 20), pVar, str, (String) entry2.getKey(), (Continuation) null)));
            } else if (y0Var instanceof r0) {
                flowE = t1.E(q.k(new fc0.e(y0Var, pVar, str, (String) entry2.getKey(), (Continuation) null, 24)));
            } else if (y0Var instanceof v0) {
                flowE = t1.E(q.k(new fc0.e(y0Var, pVar, str, (String) entry2.getKey(), (Continuation) null, 26)));
            } else if (y0Var instanceof kr.q0) {
                kr.q0 q0Var = (kr.q0) y0Var;
                flowE = t1.E(q.k(new ac8.h(14, (Object) null, q0Var.f188559a, new lea.b(pVar, q0Var, 22), pVar, str, (String) entry2.getKey(), (Continuation) null)));
            } else if (y0Var instanceof p0) {
                flowE = t1.E(q.k(new fc0.e(y0Var, pVar, str, (String) entry2.getKey(), (Continuation) null, 23)));
            } else {
                if (!(y0Var instanceof x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                x0 x0Var2 = (x0) y0Var;
                flowE = t1.E(q.k(new ac8.h(14, (Object) null, x0Var2.f188605a, new lea.b(pVar, x0Var2, 21), pVar, str, (String) entry2.getKey(), (Continuation) null)));
            }
            arrayList9.add(flowE);
        }
        return new j(jContentLength, arrayList9);
    }
}
