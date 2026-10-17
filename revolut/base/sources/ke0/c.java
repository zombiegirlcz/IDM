package ke0;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements je0.c {
    @Override // je0.c
    public final boolean a(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Class cls = type instanceof Class ? (Class) type : null;
        if (cls != null) {
            return Parcelable.class.isAssignableFrom(cls);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // je0.b
    public final Object b(Serializable serializable, Type type) {
        byte[] item = (byte[]) serializable;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        try {
            parcelObtain.unmarshall(item, 0, item.length);
            parcelObtain.setDataPosition(0);
            Parcelable parcelable = parcelObtain.readParcelable(((Class) type).getClassLoader());
            Intrinsics.i(parcelable, "null cannot be cast to non-null type T of com.revolut.core.data.mapper.binary.ParcelableObjectMapper.mapFrom");
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // je0.b
    public final Object c(Object item, Type type) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(type, "type");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
        try {
            parcelObtain.writeParcelable((Parcelable) item, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            Intrinsics.h(bArrMarshall);
            return bArrMarshall;
        } finally {
            parcelObtain.recycle();
        }
    }
}
