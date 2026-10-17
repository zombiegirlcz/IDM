package pq0;

import com.revolut.data.model.Data;
import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$RemoteStoriesModel;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.d2;
import zkm.a0;
import zkm.x;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238635a;

    public /* synthetic */ d(int i) {
        this.f238635a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object data) {
        switch (this.f238635a) {
            case 0:
                ((Integer) obj2).intValue();
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(data instanceof f);
            case 1:
                od0.i lastUpdatedTimestampOptional = (od0.i) obj2;
                Long lastLoadedFromNetworkTimestamp = (Long) data;
                Intrinsics.checkNotNullParameter(lastUpdatedTimestampOptional, "lastUpdatedTimestampOptional");
                Intrinsics.checkNotNullParameter(lastLoadedFromNetworkTimestamp, "lastLoadedFromNetworkTimestamp");
                if (lastUpdatedTimestampOptional.d()) {
                    return new pza.h(((Number) lastUpdatedTimestampOptional.c()).longValue(), ((Number) lastUpdatedTimestampOptional.c()).longValue() > lastLoadedFromNetworkTimestamp.longValue());
                }
                return new pza.h(Long.MIN_VALUE, true);
            case 2:
                Intrinsics.checkNotNullParameter(obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data, "<unused var>");
                return Unit.f186387a;
            case 3:
                Intrinsics.checkNotNullParameter(obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data, "<unused var>");
                return Unit.f186387a;
            case 4:
                Throwable error = (Throwable) obj2;
                RemoteStoriesContract$RemoteStoriesModel remoteStoriesContract$RemoteStoriesModel = (RemoteStoriesContract$RemoteStoriesModel) data;
                Intrinsics.checkNotNullParameter(error, "error");
                if (remoteStoriesContract$RemoteStoriesModel == null) {
                    return error;
                }
                return null;
            case 5:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return bool;
            case 6:
                return ((CoroutineContext) obj2).plus((CoroutineContext.Element) data);
            case 7:
                return ((CoroutineContext) obj2).plus((CoroutineContext.Element) data);
            case 8:
                Data data2 = (Data) obj2;
                Data data3 = (Data) data;
                Object objM = org.bouncycastle.jcajce.provider.digest.a.m(data2, data3, "_a", "_b");
                Object content = data3.getContent();
                CompositeException compositeException = null;
                Pair pair = (objM == null || content == null) ? null : new Pair(objM, content);
                Throwable[] elements = {data2.getError(), data3.getError()};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                if (((ArrayList) listL).isEmpty()) {
                    listL = null;
                }
                if (listL != null) {
                    Throwable[] thArr = (Throwable[]) listL.toArray(new Throwable[0]);
                    compositeException = new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
                }
                return new Data(pair, compositeException, data2.getLoading() || data3.getLoading());
            case 9:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                return e;
            case 10:
                return Boolean.valueOf(Intrinsics.f(obj2, data));
            case 11:
                Intrinsics.checkNotNullParameter(obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data, "<unused var>");
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter(obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data, "<unused var>");
                return Unit.f186387a;
            case 13:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                a0.d.B(data);
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "<destruct>");
                throw null;
            case 14:
                a0.d.B(obj2);
                aj0.c response = (aj0.c) data;
                Intrinsics.checkNotNullParameter(null, "key");
                Intrinsics.checkNotNullParameter(response, "response");
                throw null;
            case 15:
                return Integer.valueOf(((Integer) obj2).intValue() + 1);
            case 16:
                CoroutineContext.Element element = (CoroutineContext.Element) data;
                if (!(element instanceof d2)) {
                    return obj2;
                }
                Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
            case 17:
                d2 d2Var = (d2) obj2;
                CoroutineContext.Element element2 = (CoroutineContext.Element) data;
                if (d2Var != null) {
                    return d2Var;
                }
                if (element2 instanceof d2) {
                    return (d2) element2;
                }
                return null;
            default:
                a0 a0Var = (a0) obj2;
                CoroutineContext.Element element3 = (CoroutineContext.Element) data;
                if (element3 instanceof d2) {
                    d2 d2Var2 = (d2) element3;
                    Object objB = ((x) d2Var2).b(a0Var.f323094a);
                    Object[] objArr = a0Var.f323095b;
                    int i = a0Var.d;
                    objArr[i] = objB;
                    d2[] d2VarArr = a0Var.f323096c;
                    a0Var.d = i + 1;
                    d2VarArr[i] = d2Var2;
                }
                return a0Var;
        }
    }

    public /* synthetic */ d(wf0.x xVar) {
        this.f238635a = 14;
    }
}
