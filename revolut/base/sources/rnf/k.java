package rnf;

import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import d9.t0;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ File u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(File file, l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = file;
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        File file = this.u;
        File file2 = null;
        if (!t0.m(file)) {
            return new FileImage(file, (FileImage.Placeholder) null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), 10);
        }
        enf.c cVar = this.v.f255664b;
        Intrinsics.checkNotNullParameter(file, "file");
        File fileB = enf.c.b(file);
        if (t0.m(file) && fileB.exists()) {
            file2 = fileB;
        }
        return file2 != null ? new FileImage(file2, l.d, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG)) : l.e;
    }
}
