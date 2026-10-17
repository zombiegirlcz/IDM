package n9i;

import com.revolut.feature_reactions_keyboard.impl.data.network.ReactionsKeyboardGiphyService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n4d.a0;
import org.jetbrains.annotations.NotNull;
import ufm.i;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f213657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReactionsKeyboardGiphyService f213658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9i.a f213659c;
    public final p9i.a d;
    public final w4l.f e;

    public f(d type, ReactionsKeyboardGiphyService giphyService, l9i.a giphyImageMapper, p9i.a memoryCache) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(giphyService, "giphyService");
        Intrinsics.checkNotNullParameter(giphyImageMapper, "giphyImageMapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f213657a = type;
        this.f213658b = giphyService;
        this.f213659c = giphyImageMapper;
        this.d = memoryCache;
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: n9i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f213653b;

            {
                this.f213653b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                f fVar = this.f213653b;
                switch (i2) {
                    case 0:
                        l9i.a aVar = fVar.f213659c;
                        ReactionsKeyboardGiphyService reactionsKeyboardGiphyService = fVar.f213658b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d dVar = (d) pair.f186385a;
                        String str = (String) pair.f186386b;
                        int i3 = e.f213656a[dVar.ordinal()];
                        if (i3 == 1) {
                            ReactionsKeyboardGiphyService.Companion companion = ReactionsKeyboardGiphyService.INSTANCE;
                            d0<m9i.c> d0VarSearchGif = reactionsKeyboardGiphyService.searchGif(str, 50, 0, "g", null);
                            a0 a0Var = new a0(new v9(1, aVar, l9i.a.class, "mapSearchGifResults", "mapSearchGifResults(Lcom/revolut/feature_reactions_keyboard/impl/data/network/model/GiphySearchDto;)Lcom/revolut/feature_reactions_keyboard/api/model/ReactionsImageSearchResults;", 0, 22), 23);
                            d0VarSearchGif.getClass();
                            return new i(d0VarSearchGif, a0Var, 1);
                        }
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ReactionsKeyboardGiphyService.Companion companion2 = ReactionsKeyboardGiphyService.INSTANCE;
                        d0<m9i.c> d0VarSearchSticker = reactionsKeyboardGiphyService.searchSticker(str, 50, 0, "g", null);
                        a0 a0Var2 = new a0(new v9(1, aVar, l9i.a.class, "mapSearchStickerResults", "mapSearchStickerResults(Lcom/revolut/feature_reactions_keyboard/impl/data/network/model/GiphySearchDto;)Lcom/revolut/feature_reactions_keyboard/api/model/ReactionsImageSearchResults;", 0, 23), 24);
                        d0VarSearchSticker.getClass();
                        return new i(d0VarSearchSticker, a0Var2, 1);
                    default:
                        Pair pair2 = (Pair) obj2;
                        i9i.d result = (i9i.d) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(result, "result");
                        String str2 = (String) pair2.f186386b;
                        fVar.d.f("CACHE_KEY_SEARCH" + str2, result);
                        return Unit.f186387a;
                }
            }
        };
        b bVar = new b(this, i);
        final int i2 = 1;
        this.e = new w4l.f(function2, bVar, new Function2(this) { // from class: n9i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f213653b;

            {
                this.f213653b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                f fVar = this.f213653b;
                switch (i22) {
                    case 0:
                        l9i.a aVar = fVar.f213659c;
                        ReactionsKeyboardGiphyService reactionsKeyboardGiphyService = fVar.f213658b;
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Pair pair = (Pair) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        d dVar = (d) pair.f186385a;
                        String str = (String) pair.f186386b;
                        int i3 = e.f213656a[dVar.ordinal()];
                        if (i3 == 1) {
                            ReactionsKeyboardGiphyService.Companion companion = ReactionsKeyboardGiphyService.INSTANCE;
                            d0<m9i.c> d0VarSearchGif = reactionsKeyboardGiphyService.searchGif(str, 50, 0, "g", null);
                            a0 a0Var = new a0(new v9(1, aVar, l9i.a.class, "mapSearchGifResults", "mapSearchGifResults(Lcom/revolut/feature_reactions_keyboard/impl/data/network/model/GiphySearchDto;)Lcom/revolut/feature_reactions_keyboard/api/model/ReactionsImageSearchResults;", 0, 22), 23);
                            d0VarSearchGif.getClass();
                            return new i(d0VarSearchGif, a0Var, 1);
                        }
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ReactionsKeyboardGiphyService.Companion companion2 = ReactionsKeyboardGiphyService.INSTANCE;
                        d0<m9i.c> d0VarSearchSticker = reactionsKeyboardGiphyService.searchSticker(str, 50, 0, "g", null);
                        a0 a0Var2 = new a0(new v9(1, aVar, l9i.a.class, "mapSearchStickerResults", "mapSearchStickerResults(Lcom/revolut/feature_reactions_keyboard/impl/data/network/model/GiphySearchDto;)Lcom/revolut/feature_reactions_keyboard/api/model/ReactionsImageSearchResults;", 0, 23), 24);
                        d0VarSearchSticker.getClass();
                        return new i(d0VarSearchSticker, a0Var2, 1);
                    default:
                        Pair pair2 = (Pair) obj2;
                        i9i.d result = (i9i.d) obj3;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        Intrinsics.checkNotNullParameter(result, "result");
                        String str2 = (String) pair2.f186386b;
                        fVar.d.f("CACHE_KEY_SEARCH" + str2, result);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
