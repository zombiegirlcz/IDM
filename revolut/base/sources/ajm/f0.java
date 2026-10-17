package ajm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zim.o2;

/* JADX INFO: loaded from: classes14.dex */
public final class f0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Member f5615c;
    public final r10.r d;
    public final IntRange[] e;
    public final boolean f;

    /* JADX WARN: Removed duplicated region for block: B:135:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[LOOP:1: B:25:0x007a->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(ajm.i r11, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ajm.f0.<init>(ajm.i, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):void");
    }

    public final IntRange a(int i) {
        IntRange[] intRangeArr = this.e;
        if (i >= 0 && i < intRangeArr.length) {
            return intRangeArr[i];
        }
        if (intRangeArr.length == 0) {
            return new IntRange(i, i, 1);
        }
        int length = ((IntRange) kotlin.collections.d.e0(intRangeArr)).f186449b + 1 + (i - intRangeArr.length);
        return new IntRange(length, length, 1);
    }

    @Override // ajm.i
    public final Member b() {
        return this.f5615c;
    }

    @Override // ajm.i
    public final boolean c() {
        return this.f5614b instanceof u;
    }

    @Override // ajm.i
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        Intrinsics.checkNotNullParameter(args, "args");
        r10.r rVar = this.d;
        IntRange intRange = (IntRange) rVar.f250851a;
        List[] listArr = (List[]) rVar.f250852b;
        Method method = (Method) rVar.f250853c;
        boolean zIsEmpty = intRange.isEmpty();
        int i = intRange.f186449b;
        int i2 = intRange.f186448a;
        if (!zIsEmpty) {
            if (this.f) {
                aim.e eVar = new aim.e(args.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    eVar.add(args[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj2 = args[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj2 != null) {
                                    objE2 = method2.invoke(obj2, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objE2 = o2.e(returnType);
                                }
                                eVar.add(objE2);
                            }
                        } else {
                            eVar.add(obj2);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i5 = i + 1;
                Intrinsics.checkNotNullParameter(args, "<this>");
                int length = args.length - 1;
                if (i5 <= length) {
                    while (true) {
                        eVar.add(args[i5]);
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                    }
                }
                args = zhm.u.a(eVar).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i6 = 0; i6 < length2; i6++) {
                    if (i6 > i || i2 > i6) {
                        objE = args[i6];
                    } else {
                        List list2 = listArr[i6];
                        Method method3 = list2 != null ? (Method) zhm.d0.K0(list2) : null;
                        objE = args[i6];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objE = o2.e(returnType2);
                            }
                        }
                    }
                    objArr[i6] = objE;
                }
                args = objArr;
            }
        }
        Object objCall = this.f5614b.call(args);
        return (objCall == fim.a.COROUTINE_SUSPENDED || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // ajm.i
    public final List d() {
        return this.f5614b.d();
    }

    @Override // ajm.i
    public final Type getReturnType() {
        return this.f5614b.getReturnType();
    }
}
