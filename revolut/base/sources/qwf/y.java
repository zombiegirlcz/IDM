package qwf;

import androidx.room.RoomDatabase;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ swf.f f249937b;

    public /* synthetic */ y(swf.f fVar, int i) {
        this.f249936a = i;
        this.f249937b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f249936a) {
            case 0:
                o oVar = (o) obj2;
                swf.f fVar = this.f249937b;
                return o.a(oVar, 0L, null, fVar.f266210a, fVar.f266211b, null, null, null, null, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            default:
                swf.f fVar2 = this.f249937b;
                Map values = fVar2.f266210a;
                List errors = fVar2.f266211b;
                List fields = ((uwf.h) obj2).f283658a;
                Intrinsics.checkNotNullParameter(fields, "fields");
                Intrinsics.checkNotNullParameter(values, "values");
                Intrinsics.checkNotNullParameter(errors, "errors");
                return new uwf.h(values, fields, errors);
        }
    }
}
