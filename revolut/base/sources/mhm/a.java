package mhm;

import java.io.Serializable;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f205585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f205586c;

    public /* synthetic */ a(b bVar, Function function, int i) {
        this.f205584a = i;
        this.f205585b = bVar;
        this.f205586c = function;
    }

    @Override // mhm.b, java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f205584a) {
            case 0:
                b bVar = this.f205585b;
                bVar.getClass();
                return bVar.apply(this.f205586c.apply(obj2));
            default:
                return this.f205586c.apply(this.f205585b.apply(obj2));
        }
    }
}
