package hd;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.revolut.sso.api.models.SimBindingEvidence;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import md.u1;

/* JADX INFO: loaded from: classes17.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f151343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f151344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f151345c;

    public e(String str, Rect rect, List list, String str2, Matrix matrix) {
        this.f151343a = str;
        Rect rect2 = new Rect(rect);
        if (matrix != null) {
            xam.a.I(rect2, matrix);
        }
        this.f151344b = rect2;
        Point[] pointArr = new Point[list.size()];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        if (matrix != null) {
            xam.a.G(pointArr, matrix);
        }
        this.f151345c = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r12, com.revolut.sso.api.models.Evidence r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.e.a(java.lang.String, com.revolut.sso.api.models.Evidence, gim.c):java.lang.Object");
    }

    public ed.c b() {
        return ed.c.ALGORITHM_NOT_FIPS;
    }

    public abstract String c();

    public Object d(com.google.crypto.tink.shaded.protobuf.a aVar, Class cls) {
        bd.f fVar = (bd.f) ((Map) this.f151345c).get(cls);
        if (fVar != null) {
            return fVar.a(aVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract cam.f e();

    public abstract u1 f();

    public abstract com.google.crypto.tink.shaded.protobuf.a g(com.google.crypto.tink.shaded.protobuf.j jVar);

    public abstract Object h(kql.h hVar, String str, SimBindingEvidence simBindingEvidence, kql.g gVar);

    public abstract void i(com.google.crypto.tink.shaded.protobuf.a aVar);

    public String j() {
        String str = (String) this.f151343a;
        return str == null ? "" : str;
    }

    public e(gu2.e captchaViewControllerExtension, akl.l claimsRepository, mni.a otpDispatcher) {
        Intrinsics.checkNotNullParameter(captchaViewControllerExtension, "captchaViewControllerExtension");
        Intrinsics.checkNotNullParameter(claimsRepository, "claimsRepository");
        Intrinsics.checkNotNullParameter(otpDispatcher, "otpDispatcher");
        this.f151343a = captchaViewControllerExtension;
        this.f151344b = claimsRepository;
        this.f151345c = otpDispatcher;
    }

    public e(dj0.d dVar, s6i.d dVar2, q6i.r rVar) {
        this.f151343a = dVar;
        this.f151344b = dVar2;
        this.f151345c = rVar;
    }

    public e(Class cls, bd.f... fVarArr) {
        this.f151343a = cls;
        HashMap map = new HashMap();
        for (bd.f fVar : fVarArr) {
            Class cls2 = fVar.f14473a;
            if (!map.containsKey(cls2)) {
                map.put(cls2, fVar);
            } else {
                throw new IllegalArgumentException(a10.b.q(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (fVarArr.length > 0) {
            this.f151344b = fVarArr[0].f14473a;
        } else {
            this.f151344b = Void.class;
        }
        this.f151345c = Collections.unmodifiableMap(map);
    }
}
