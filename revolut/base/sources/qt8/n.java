package qt8;

import com.revolut.feature.kyc.core.impl.kyc.UserKycService;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.channels.ProducerScope;
import oe0.a;
import okhttp3.MultipartBody$Part;
import ulm.e1;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ File f249033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f249034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f249035y;
    public final /* synthetic */ av.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(File file, o oVar, String str, av.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f249033w = file;
        this.f249034x = oVar;
        this.f249035y = str;
        this.z = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.f249033w, this.f249034x, this.f249035y, this.z, continuation);
        nVar.v = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProducerScope producerScope = (ProducerScope) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        try {
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    n0 n0Var = new n0();
                    File file = this.f249033w;
                    long length = file.length();
                    o oVar = this.f249034x;
                    m31.c cVar = oVar.f249037b;
                    csl.a bytesWritten = new csl.a(n0Var, length, producerScope, 17);
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(bytesWritten, "bytesWritten");
                    j21.b bVar = new j21.b(m31.c.a(file), bytesWritten);
                    UserKycService userKycService = oVar.f249036a;
                    String str = this.f249035y;
                    String name = file.getName();
                    MultipartBody$Part.Companion.getClass();
                    MultipartBody$Part multipartBody$PartC = e1.c("scan", name, bVar);
                    MultipartBody$Part multipartBody$PartA = o.a(oVar, this.z);
                    this.v = producerScope;
                    this.u = 1;
                    if (userKycService.uploadKycInhouseDocument(str, multipartBody$PartC, multipartBody$PartA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                producerScope.mo3647trySendJP2dKIU(new a.C1250a());
            } catch (Exception e) {
                producerScope.mo3647trySendJP2dKIU(new oe0.b(e));
            }
            producerScope.close(null);
            return Unit.f186387a;
        } catch (Throwable th10) {
            producerScope.close(null);
            throw th10;
        }
    }
}
