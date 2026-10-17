package ihi;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    View b(int i);

    int c(int i, int i2, int i3);

    int d(View view);

    View e(int i);

    void f(com.revolut.flexbox.a aVar);

    int g(View view, int i, int i2);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int h(int i, int i2, int i3);

    void i(View view);

    void j(int i, View view);

    void k(View view, int i, int i2, com.revolut.flexbox.a aVar);

    boolean l();

    void setFlexLines(List list);
}
