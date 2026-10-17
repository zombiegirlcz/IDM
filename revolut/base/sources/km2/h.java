package km2;

import com.revolut.core.error.data.model.ServerErrorException;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import retrofit2.HttpException;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.o1;
import ulm.p1;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f185691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f185692x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f185691w = str2;
        this.f185692x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f185691w, this.f185692x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.f185692x;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                p1 p1Var = RequestBody.Companion;
                b1.Companion.getClass();
                b1 b1VarB = a1.b("text/plain");
                p1Var.getClass();
                o1 o1VarB = p1.b(this.v, b1VarB);
                e1 e1Var = MultipartBody$Part.Companion;
                b1 b1VarB2 = a1.b("image/jpg");
                File file = new File(this.f185691w);
                Intrinsics.checkNotNullParameter(file, "file");
                k1 k1VarA = p1.a(file, b1VarB2);
                e1Var.getClass();
                efm.b bVarUploadBackground = iVar.f185693a.uploadBackground(o1VarB, e1.c("background", null, k1VarA));
                this.u = 1;
                if (nim.a.a(bVarUploadBackground, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        } catch (HttpException e) {
            ServerErrorException.Companion companion = ServerErrorException.INSTANCE;
            kg.o oVar = iVar.f;
            companion.getClass();
            throw ServerErrorException.Companion.c(e, oVar);
        }
    }
}
