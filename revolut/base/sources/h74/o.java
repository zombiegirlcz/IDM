package h74;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lu3.c f149859b;

    public /* synthetic */ o(lu3.c cVar, int i) {
        this.f149858a = i;
        this.f149859b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        a aVar = (a) obj2;
        switch (this.f149858a) {
        }
        return a.a(aVar, null, new Data(this.f149859b, null, false, 6, null), 1);
    }
}
