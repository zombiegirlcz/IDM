package a0;

import a09.c0;
import a09.i0;
import a09.l;
import a41.f0;
import a41.k0;
import an.g;
import an.n;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.media.ExpectedOutputsListener;
import androidx.camera.core.ImageCapture;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.room.support.AutoCloser;
import au6.j1;
import bd.d0;
import bd.k;
import bd.s;
import bd.u;
import bd.y;
import be6.h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.q;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigration;
import efm.m;
import hd.r;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kfm.o;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import md.a0;
import md.b1;
import md.b3;
import md.j0;
import md.p0;
import md.w2;
import mp.p;
import okhttp3.ResponseBody;
import r10.v;
import s7.e;
import u09.f;
import u09.n0;
import yhm.m;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements ExpectedOutputsListener, FrameDistributor.FrameStartedListener, o, VisualTransformation, lmm.d, e, Function, AutoCloser.Watch, hd.b, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    public /* synthetic */ b(int i) {
        this.f89a = i;
    }

    @Override // hd.b
    public ad.c a(r rVar) throws GeneralSecurityException {
        switch (this.f89a) {
            case 22:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    a0 a0VarC = a0.C((j) rVar.f151366c, q.a());
                    if (a0VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size = a0VarC.y().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iX = a0VarC.z().x();
                    if (iX != 12 && iX != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iX)));
                    }
                    k kVar = new k(size, iX, 16, bd.m.a((w2) rVar.e));
                    r10.r rVar2 = new r10.r();
                    rVar2.f250852b = null;
                    rVar2.f250853c = null;
                    rVar2.f250851a = kVar;
                    rVar2.f250852b = new t1(od.a.a(a0VarC.y().e()), 24);
                    rVar2.f250853c = (Integer) rVar.f;
                    return rVar2.g();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 23:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    j0 j0VarA = j0.A((j) rVar.f151366c, q.a());
                    if (j0VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size2 = j0VarA.x().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    bd.o oVar = new bd.o(size2, 12, 16, bd.q.a((w2) rVar.e));
                    v vVar = new v(7);
                    vVar.f250864c = null;
                    vVar.d = null;
                    vVar.f250863b = oVar;
                    vVar.f250864c = new t1(od.a.a(j0VarA.x().e()), 24);
                    vVar.d = (Integer) rVar.f;
                    return vVar.f();
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 24:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    p0 p0VarA = p0.A((j) rVar.f151366c, q.a());
                    if (p0VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size3 = p0VarA.x().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    s sVar = new s(size3, u.a((w2) rVar.e));
                    p pVar = new p(8);
                    pVar.f207710c = null;
                    pVar.d = null;
                    pVar.f207709b = sVar;
                    pVar.f207710c = new t1(od.a.a(p0VarA.x().e()), 24);
                    pVar.d = (Integer) rVar.f;
                    return pVar.f();
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 25:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    b1 b1VarA = b1.A((j) rVar.f151366c, q.a());
                    if (b1VarA.y() == 0) {
                        return bd.v.b(y.a((w2) rVar.e), new t1(od.a.a(b1VarA.x().e()), 24), (Integer) rVar.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            default:
                if (!((String) rVar.f151364a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    b3 b3VarA = b3.A((j) rVar.f151366c, q.a());
                    if (b3VarA.y() == 0) {
                        return bd.a0.b(d0.a((w2) rVar.e), new t1(od.a.a(b3VarA.x().e()), 24), (Integer) rVar.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f89a) {
            case 2:
                l lVar = l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) lVar.invoke(p0);
            case 3:
                c0 c0Var = c0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u09.q) c0Var.invoke(p0);
            case 4:
                a09.d0 d0Var = a09.d0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n0) d0Var.invoke(p0);
            case 5:
                i0 i0Var = i0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u09.p0) i0Var.invoke(p0);
            case 6:
            case 11:
            case 12:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                h hVar = h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ExtensionAuthRequestData) hVar.invoke(p0);
            case 7:
                a31.u uVar = a31.u.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) uVar.invoke(p0);
            case 8:
                k0 k0Var = k0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f0) k0Var.invoke(p0);
            case 9:
                aa4.d dVar = aa4.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) dVar.invoke(p0);
            case 10:
                return (wi0.b) ahf.q.f.invoke(p0);
            case 13:
                n nVar = n.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (g) nVar.invoke(p0);
            case 14:
                an.o oVar = an.o.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (an.h) oVar.invoke(p0);
            case 15:
                an.p pVar = an.p.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (an.j) pVar.invoke(p0);
            case 16:
                atg.u uVar2 = atg.u.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) uVar2.invoke(p0);
            case 17:
                j1 j1Var = j1.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j1Var.invoke(p0);
            case 18:
                return ((ResponseBody) p0).string();
            case 20:
                return ImageCapture.lambda$submitStillCaptureRequest$5((List) p0);
            case 27:
                bd9.b bVar = bd9.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (UserMigration) bVar.invoke(p0);
        }
    }

    @Override // efm.m
    public void b(rfm.c emitter) {
        Object objA;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = null;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (emitter.isDisposed()) {
            return;
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            if (emitter.b(thA)) {
                return;
            }
            mo3.a.m(thA);
        } else {
            sd0.a aVar = (sd0.a) objA;
            if (aVar != null) {
                emitter.a(aVar);
            } else {
                emitter.onComplete();
            }
        }
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return VisualTransformation.Companion.None$lambda$0(annotatedString);
    }

    @Override // s7.e
    public Object getValue() {
        return null;
    }

    @Override // lmm.d
    public void log(String message) {
        switch (this.f89a) {
            case 11:
                Intrinsics.checkNotNullParameter(message, "message");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "Network", message, null, null, 16);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "Network", message, null, null, 16);
                break;
        }
    }

    public /* synthetic */ b(CameraStream cameraStream, aim.f fVar) {
        this.f89a = 0;
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f89a = i;
    }
}
