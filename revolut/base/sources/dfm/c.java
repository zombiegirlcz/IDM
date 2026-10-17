package dfm;

import ag.w;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import c8.i;
import ce.f;
import ce.t;
import ce.v;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import e8.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;
import kfm.g;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import l8.c0;
import l8.d0;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;
import qe.d;
import r8.n;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements i, ErrorReporter, ReceiverValue, d0, g, p, d, n, zc.n, f, z8.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f114549b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114550a;

    public /* synthetic */ c(int i) {
        this.f114550a = i;
    }

    public static /* synthetic */ void c(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static qe.b d(ch.b bVar) {
        return new qe.b(System.currentTimeMillis() + ((long) DateTimeConstants.MILLIS_PER_HOUR), new w(8), new j(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // zc.o
    public Object a() {
        return new ch.b(13);
    }

    @Override // kfm.g
    public void accept(Object obj2) {
    }

    @Override // c8.i
    public void b(byte[] bArr, Object obj2, MessageDigest messageDigest) {
    }

    @Override // z8.c
    public void e(Object obj2) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public KotlinType getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // l8.d0
    public void k(MediaExtractor mediaExtractor, Object obj2) throws IOException {
        mediaExtractor.setDataSource(new c0((ByteBuffer) obj2));
    }

    @Override // l8.d0
    public void l(MediaMetadataRetriever mediaMetadataRetriever, Object obj2) {
        mediaMetadataRetriever.setDataSource(new c0((ByteBuffer) obj2));
    }

    @Override // ce.f
    public Object m(v vVar) {
        switch (this.f114550a) {
            case 15:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(vVar);
            case 20:
                return new bh.d(vVar.g(t.a(bh.c.class)));
            default:
                return new bh.c(vVar.c(ah.a.class));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor != null) {
            return;
        }
        c(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public void reportIncompleteHierarchy(ClassDescriptor classDescriptor, List list) {
        if (classDescriptor == null) {
            c(0);
            throw null;
        }
        if (list != null) {
            return;
        }
        c(1);
        throw null;
    }

    @Override // kfm.p
    public boolean test(Object obj2) {
        return true;
    }

    public String toString() {
        switch (this.f114550a) {
            case 8:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f114550a = i;
    }

    public c(go3.b walletMapper) {
        this.f114550a = 14;
        Intrinsics.checkNotNullParameter(walletMapper, "walletMapper");
    }

    @Override // qe.d
    public qe.b a(ch.b bVar, JSONObject jSONObject) {
        return d(bVar);
    }
}
