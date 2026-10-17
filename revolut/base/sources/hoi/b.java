package hoi;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView.ViewHolder f154300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView.ViewHolder f154301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154302c;
    public final int d;
    public final int e;
    public final int f;

    public b(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i5) {
        this.f154300a = viewHolder;
        this.f154301b = viewHolder2;
        this.f154302c = i;
        this.d = i2;
        this.e = i3;
        this.f = i5;
    }

    public final String toString() {
        RecyclerView.ViewHolder viewHolder = this.f154300a;
        RecyclerView.ViewHolder viewHolder2 = this.f154301b;
        StringBuilder sb6 = new StringBuilder("ChangeInfo{oldHolder=");
        sb6.append(viewHolder);
        sb6.append(", newHolder=");
        sb6.append(viewHolder2);
        sb6.append(", fromX=");
        t61.a.x(sb6, this.f154302c, ", fromY=", this.d, ", toX=");
        sb6.append(this.e);
        sb6.append(", toY=");
        sb6.append(this.f);
        sb6.append("}");
        return sb6.toString();
    }
}
