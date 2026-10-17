package ip0;

import android.widget.NumberPicker;
import com.revolut.core.ui_kit.delegates.DoublePickerDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class qe implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseRecyclerViewDelegate f165967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f165968c;

    public /* synthetic */ qe(BaseRecyclerViewDelegate baseRecyclerViewDelegate, Object obj2, int i) {
        this.f165966a = i;
        this.f165967b = baseRecyclerViewDelegate;
        this.f165968c = obj2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        switch (this.f165966a) {
            case 0:
                ((DoublePickerDelegate) this.f165967b).f52193c.onNext(new Pair((re) this.f165968c, Integer.valueOf(i2)));
                break;
            case 1:
                ((DoublePickerDelegate) this.f165967b).d.onNext(new Pair((re) this.f165968c, Integer.valueOf(i2)));
                break;
            default:
                ((PickerDelegate) this.f165967b).f52922c.onNext(new Pair((a10) this.f165968c, Integer.valueOf(i2)));
                break;
        }
    }
}
