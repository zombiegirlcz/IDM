package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.revolut.tracking.v3.RawEvent;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f124856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124858c;
    public final n1 d;
    public final n1 e;
    public final boolean f;

    public p1(o1 o1Var, String str, kcm.b bVar, kcm.b bVar2) {
        new AtomicReferenceArray(2);
        this.f124856a = (o1) Preconditions.checkNotNull(o1Var, "type");
        this.f124857b = (String) Preconditions.checkNotNull(str, "fullMethodName");
        int iLastIndexOf = ((String) Preconditions.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        this.f124858c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        this.d = (n1) Preconditions.checkNotNull(bVar, "requestMarshaller");
        this.e = (n1) Preconditions.checkNotNull(bVar2, "responseMarshaller");
        this.f = true;
    }

    public static String a(String str, String str2) {
        return ((String) Preconditions.checkNotNull(str, "fullServiceName")) + "/" + ((String) Preconditions.checkNotNull(str2, "methodName"));
    }

    public final com.google.protobuf.d2 b(InputStream inputStream) {
        com.google.protobuf.t tVarI;
        byte[] bArr;
        kcm.b bVar = (kcm.b) this.e;
        bVar.getClass();
        if ((inputStream instanceof kcm.a) && ((kcm.a) inputStream).f182750b == bVar.f182752a) {
            try {
                RawEvent rawEvent = ((kcm.a) inputStream).f182749a;
                if (rawEvent != null) {
                    return rawEvent;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof q0) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return bVar.f182753b;
                    }
                    tVarI = null;
                } else {
                    ThreadLocal threadLocal = kcm.b.d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    tVarI = com.google.protobuf.t.h(bArr, 0, iAvailable, false);
                }
            } else {
                tVarI = null;
            }
            if (tVarI == null) {
                tVarI = com.google.protobuf.t.i(inputStream);
            }
            int i3 = bVar.f182754c;
            if (i3 >= 0) {
                if (i3 < 0) {
                    throw new IllegalArgumentException(a0.d.n("Recursion limit cannot be negative: ", i3));
                }
                tVarI.f49789b = i3;
            }
            try {
                com.google.protobuf.w0 partialFrom = com.google.protobuf.w0.parsePartialFrom(((com.google.protobuf.q0) bVar.f182752a).f49773a, tVarI, kcm.c.f182755a);
                if (partialFrom != null && !partialFrom.isInitialized()) {
                    UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = partialFrom.newUninitializedMessageException();
                    uninitializedMessageExceptionNewUninitializedMessageException.getClass();
                    throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
                }
                tVarI.a(0);
                return partialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw new StatusRuntimeException(g2.f124806l.g("Invalid protobuf byte sequence").f(e));
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final kcm.a c(RawEvent rawEvent) {
        kcm.b bVar = (kcm.b) this.d;
        bVar.getClass();
        return new kcm.a(rawEvent, bVar.f182752a);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("fullMethodName", this.f124857b).add("type", this.f124856a).add("idempotent", false).add("safe", false).add("sampledToLocalTracing", this.f).add("requestMarshaller", this.d).add("responseMarshaller", this.e).add("schemaDescriptor", (Object) null).omitNullValues().toString();
    }
}
