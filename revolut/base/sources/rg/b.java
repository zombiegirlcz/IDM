package rg;

import android.os.AsyncTask;
import androidx.collection.LruCache;
import gyi.z;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import sg.d;
import tg.k;
import tg.l;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f253988a;

    public b(c cVar) {
        this.f253988a = cVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Float[] fArr = (Float[]) objArr;
        d dVar = this.f253988a.d;
        dVar.t();
        try {
            float fFloatValue = fArr[0].floatValue();
            sg.c cVar = dVar.f262571b;
            ExecutorService executorService = cVar.e;
            int i = (int) fFloatValue;
            Set setF = cVar.F(i);
            LruCache lruCache = cVar.f262570c;
            int i2 = i + 1;
            if (lruCache.get(Integer.valueOf(i2)) == null) {
                executorService.execute(new z(cVar, i2));
            }
            int i3 = i - 1;
            if (lruCache.get(Integer.valueOf(i3)) == null) {
                executorService.execute(new z(cVar, i3));
            }
            return setF;
        } finally {
            dVar.C();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj2) {
        Set set = (Set) obj2;
        l lVar = this.f253988a.e.f271036n;
        synchronized (lVar) {
            lVar.f271024b = new k(lVar.f271025c, set);
        }
        lVar.sendEmptyMessage(0);
    }
}
