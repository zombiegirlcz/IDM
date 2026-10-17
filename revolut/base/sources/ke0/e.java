package ke0;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public final class e implements je0.c {
    @Override // je0.c
    public final boolean a(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return Intrinsics.f(type, Integer.class) || Intrinsics.f(type, Long.class) || Intrinsics.f(type, Boolean.class) || Intrinsics.f(type, String.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je0.b
    public final Object b(Serializable serializable, Type type) {
        byte[] item = (byte[]) serializable;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, Integer.class)) {
            Intrinsics.checkNotNullParameter(item, "<this>");
            if (item.length == 4) {
                return Integer.valueOf(ByteBuffer.wrap(item).getInt());
            }
            throw new IllegalStateException("Can't receive int from byte array with length not equal 4");
        }
        if (Intrinsics.f(type, Long.class)) {
            Intrinsics.checkNotNullParameter(item, "<this>");
            if (item.length == 8) {
                return Long.valueOf(ByteBuffer.wrap(item).getLong());
            }
            throw new IllegalStateException("Can't receive long from byte array with length not equal 8");
        }
        if (Intrinsics.f(type, Boolean.class)) {
            Intrinsics.checkNotNullParameter(item, "<this>");
            if (item.length == 4) {
                return Boolean.valueOf(ByteBuffer.wrap(item).getInt() == 1);
            }
            throw new IllegalStateException("Can't receive int from byte array with length not equal 4");
        }
        if (Intrinsics.f(type, String.class)) {
            return new String(item, Charsets.UTF_8);
        }
        throw new IllegalArgumentException("Unsupported type: " + type + "!");
    }

    @Override // je0.b
    public final Object c(Object item, Type type) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        if (item instanceof Integer) {
            return rd0.e.f(((Number) item).intValue());
        }
        if (item instanceof Long) {
            long jLongValue = ((Number) item).longValue();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
            byteBufferWrap.putLong(jLongValue);
            byte[] bArrArray = byteBufferWrap.array();
            Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
            return bArrArray;
        }
        if (item instanceof Boolean) {
            return rd0.e.f(((Boolean) item).booleanValue() ? 1 : 0);
        }
        if (!(item instanceof String)) {
            throw new IllegalArgumentException(p.a.p("Unsupported type ", item.getClass().getName(), "!"));
        }
        byte[] bytes = ((String) item).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }
}
