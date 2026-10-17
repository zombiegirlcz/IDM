package k00;

import java.util.Iterator;
import java.util.List;
import kge.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l00.c;
import xv.i;
import xv.m;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f179892c = {o0.f186429a.j(new h0(b.class, "docQualityValidatorValue", "getDocQualityValidatorValue()Lcom/revolut/camerakit/vision_framework/DocQualityValidator;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qw.a f179893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f179894b;

    public b(d docQualityValidator, qw.a imageFormatConverter) {
        Intrinsics.checkNotNullParameter(docQualityValidator, "docQualityValidator");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        this.f179893a = imageFormatConverter;
        this.f179894b = docQualityValidator;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, i iVar, m mVar) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof c) {
                break;
            }
        }
        c cVar = (c) next;
        return cVar == null ? new j00.b(zhm.h0.f322473a) : c(mVar, cVar, (gim.c) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xv.m r12, l00.c r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k00.b.c(xv.m, l00.c, gim.c):java.lang.Object");
    }
}
