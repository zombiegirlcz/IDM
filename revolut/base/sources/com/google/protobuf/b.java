package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements d2 {
    protected int memoizedHashCode;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = j1.f49738a;
        iterable.getClass();
        if (iterable instanceof m1) {
            List underlyingElements = ((m1) iterable).getUnderlyingElements();
            m1 m1Var = (m1) list;
            int size = list.size();
            for (Object obj2 : underlyingElements) {
                if (obj2 == null) {
                    String str = "Element at index " + (m1Var.size() - size) + " is null.";
                    for (int size2 = m1Var.size() - 1; size2 >= size; size2--) {
                        m1Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj2 instanceof p) {
                    m1Var.p1((p) obj2);
                } else {
                    m1Var.add((String) obj2);
                }
            }
            return;
        }
        if (iterable instanceof n2) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t2 : iterable) {
            if (t2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t2);
        }
    }

    public static void checkByteStringIsUtf8(p pVar) throws IllegalArgumentException {
        if (!pVar.f()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(t2 t2Var);

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    @Override // com.google.protobuf.d2
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = y.d;
            w wVar = new w(bArr, 0, serializedSize);
            writeTo(wVar);
            if (wVar.L() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }

    public p toByteString() {
        try {
            int serializedSize = getSerializedSize();
            n nVar = p.f49757b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = y.d;
            w wVar = new w(bArr, 0, serializedSize);
            writeTo(wVar);
            if (wVar.L() == 0) {
                return new n(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iM = y.m(serializedSize) + serializedSize;
        if (iM > 4096) {
            iM = 4096;
        }
        x xVar = new x(outputStream, iM);
        xVar.I(serializedSize);
        writeTo(xVar);
        if (xVar.f49827h > 0) {
            xVar.Q();
        }
    }

    @Override // com.google.protobuf.d2
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = y.d;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        x xVar = new x(outputStream, serializedSize);
        writeTo(xVar);
        if (xVar.f49827h > 0) {
            xVar.Q();
        }
    }
}
