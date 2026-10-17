package zim;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends foh.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f322666a;

    public n(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f322666a = field;
    }

    @Override // foh.i
    public final String b() {
        StringBuilder sb6 = new StringBuilder();
        Field field = this.f322666a;
        String name = field.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb6.append(JvmAbi.getterName(name));
        sb6.append("()");
        Class<?> type = field.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb6.append(ReflectClassUtilKt.getDesc(type));
        return sb6.toString();
    }
}
