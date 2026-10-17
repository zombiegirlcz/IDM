package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7649b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f7648a = i;
        this.f7649b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7648a) {
            case 0:
                ((PlayerControlView.AudioTrackSelectionAdapter) this.f7649b).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            case 1:
                ((PlayerControlView.SettingViewHolder) this.f7649b).lambda$new$0(view);
                break;
            case 2:
                ((PlayerControlView.TextTrackSelectionAdapter) this.f7649b).lambda$onBindViewHolderAtZeroPosition$0(view);
                break;
            default:
                ((PlayerControlViewLayoutManager) this.f7649b).onOverflowButtonClick(view);
                break;
        }
    }
}
