package g50;

import com.revolut.chat.ui.introvideo.ChatIntroVideoScreen;
import com.revolut.chat.ui.introvideo.ChatIntroVideoScreenContract$InputData;
import g50.c;
import h30.n;
import h30.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChatIntroVideoScreen f140594b;

    public /* synthetic */ a(ChatIntroVideoScreen chatIntroVideoScreen, int i) {
        this.f140593a = i;
        this.f140594b = chatIntroVideoScreen;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f140593a;
        ChatIntroVideoScreen chatIntroVideoScreen = this.f140594b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = ChatIntroVideoScreen.P;
                ((f) chatIntroVideoScreen.M.getValue()).C2(c.C0816c.f140597a);
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr2 = ChatIntroVideoScreen.P;
                ((f) chatIntroVideoScreen.M.getValue()).C2(c.b.f140596a);
                return Unit.f186387a;
            case 2:
                KProperty[] kPropertyArr3 = ChatIntroVideoScreen.P;
                ((f) chatIntroVideoScreen.M.getValue()).C2(c.a.f140595a);
                return Unit.f186387a;
            case 3:
                KProperty[] kPropertyArr4 = ChatIntroVideoScreen.P;
                phm.a aVar = (phm.a) ue0.e.j(chatIntroVideoScreen.m2()).a().get(h30.a.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", h30.a.class, " is not found"));
                }
                n nVar = ((n) ((h30.a) aVar2.b())).f148930w;
                ChatIntroVideoScreenContract$InputData chatIntroVideoScreenContract$InputData = chatIntroVideoScreen.K;
                chatIntroVideoScreenContract$InputData.getClass();
                return new p(nVar, chatIntroVideoScreenContract$InputData);
            case 4:
                KProperty[] kPropertyArr5 = ChatIntroVideoScreen.P;
                p pVar = (p) chatIntroVideoScreen.L.getValue();
                return new f(pVar.f148938a, (q30.a) pVar.f148939b.m0.get());
            default:
                KProperty[] kPropertyArr6 = ChatIntroVideoScreen.P;
                return n14.e.a(chatIntroVideoScreen, (f) chatIntroVideoScreen.M.getValue());
        }
    }
}
