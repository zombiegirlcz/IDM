package af;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import au0.x5;
import ce.v;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import fmm.o;
import fmm.q;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.a0;
import l8.d0;
import ulm.e0;
import ulm.x0;
import yem.k;
import zc.n;
import zc.y;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements cfm.a, ReceiverValue, o, ic.a, ke.d, d0, p, JavaResolverCache, n, e0, z8.c, ce.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile f f3814b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3815a;

    public /* synthetic */ f(int i) {
        this.f3815a = i;
    }

    public static /* synthetic */ void n(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static int o(int i, byte[] bArr) {
        return (bArr[i + 4] & UnsignedBytes.MAX_VALUE) + ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16) + (bArr[i + 1] << Ascii.CAN);
    }

    @Override // zc.o
    public Object a() {
        switch (this.f3815a) {
            case 13:
                return new y("IntegrityService");
            default:
                return new qf.b(13);
        }
    }

    @Override // ic.a
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // fmm.o
    public q c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        fmm.g gVar = fmm.h.Companion;
        Class<?> cls = sslSocket.getClass();
        gVar.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(a0.d.l(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new fmm.h(superclass);
    }

    @Override // cfm.a
    public Object d(k kVar) {
        return Integer.valueOf(kVar.a());
    }

    @Override // z8.c
    public void e(Object obj2) {
        ((List) obj2).clear();
    }

    @Override // ulm.e0
    public List f(x0 url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return f0.f322471a;
    }

    @Override // ke.d
    public void g(long j2, String str) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public ClassDescriptor getClassResolvedFromSource(FqName fqName) {
        if (fqName != null) {
            return null;
        }
        n(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // ke.d
    public void h() {
    }

    @Override // ulm.e0
    public void i(x0 url2, List cookies) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }

    @Override // ke.d
    public String j() {
        return null;
    }

    @Override // l8.d0
    public void k(MediaExtractor mediaExtractor, Object obj2) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj2).getFileDescriptor());
    }

    @Override // l8.d0
    public void l(MediaMetadataRetriever mediaMetadataRetriever, Object obj2) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj2).getFileDescriptor());
    }

    @Override // ce.f
    public Object m(v vVar) {
        ch.a aVar = new ch.a();
        ch.n nVar = new ch.n(0);
        ReferenceQueue referenceQueue = aVar.f24012a;
        Set set = aVar.f24013b;
        set.add(new ch.o(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new x5(referenceQueue, set, 2), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordClass(JavaClass javaClass, ClassDescriptor classDescriptor) {
        if (javaClass == null) {
            n(7);
            throw null;
        }
        if (classDescriptor != null) {
            return;
        }
        n(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordConstructor(JavaElement javaElement, ConstructorDescriptor constructorDescriptor) {
        if (javaElement == null) {
            n(3);
            throw null;
        }
        if (constructorDescriptor != null) {
            return;
        }
        n(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordField(JavaField javaField, PropertyDescriptor propertyDescriptor) {
        if (javaField == null) {
            n(5);
            throw null;
        }
        if (propertyDescriptor != null) {
            return;
        }
        n(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache
    public void recordMethod(JavaMember javaMember, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        if (javaMember == null) {
            n(1);
            throw null;
        }
        if (simpleFunctionDescriptor != null) {
            return;
        }
        n(2);
        throw null;
    }

    @Override // kfm.p
    public boolean test(Object obj2) {
        return false;
    }

    public f(pd.g gVar) {
        this.f3815a = 19;
        gVar.a();
        Context context = gVar.f235023a;
        gVar.a();
        pd.i iVar = gVar.f235025c;
        cf.b bVar = ((xd.a) gVar.b(xd.a.class)).f304191b;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(iVar);
        Preconditions.checkNotNull(bVar);
        String str = iVar.f235030a;
        if (iVar.f235033g == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
    }

    @Override // fmm.o
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return a0.H(name, "com.google.android.gms.org.conscrypt.", false);
    }
}
