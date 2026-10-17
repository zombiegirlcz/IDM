package androidx.constraintlayout.core;

import a0.d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Metrics {
    public long bfs;
    public long constraints;
    public long determineGroups;
    public long errors;
    public long extravariables;
    public long fullySolved;
    public long graphOptimizer;
    public long graphSolved;
    public long grouping;
    public long infeasibleDetermineGroups;
    public long iterations;
    public long lastTableSize;
    public long layouts;
    public long linearSolved;
    public long mChildCount;
    public long mEquations;
    public long mMeasureCalls;
    public long mMeasureDuration;
    public int mNumberOfLayouts;
    public int mNumberOfMeasures;
    public long mSimpleEquations;
    public long mSolverPasses;
    public long mVariables;
    public long maxRows;
    public long maxTableSize;
    public long maxVariables;
    public long measuredMatchWidgets;
    public long measuredWidgets;
    public long measures;
    public long measuresLayoutDuration;
    public long measuresWidgetsDuration;
    public long measuresWrap;
    public long measuresWrapInfeasible;
    public long minimize;
    public long minimizeGoal;
    public long nonresolvedWidgets;
    public long optimize;
    public long pivots;
    public ArrayList<String> problematicLayouts = new ArrayList<>();
    public long simpleconstraints;
    public long slackvariables;
    public long tableSizeIncrease;
    public long widgets;

    public String toString() {
        StringBuilder sb6 = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb6.append(this.measures);
        sb6.append("\nmeasuresWrap: ");
        sb6.append(this.measuresWrap);
        sb6.append("\nmeasuresWrapInfeasible: ");
        sb6.append(this.measuresWrapInfeasible);
        sb6.append("\ndetermineGroups: ");
        sb6.append(this.determineGroups);
        sb6.append("\ninfeasibleDetermineGroups: ");
        sb6.append(this.infeasibleDetermineGroups);
        sb6.append("\ngraphOptimizer: ");
        sb6.append(this.graphOptimizer);
        sb6.append("\nwidgets: ");
        sb6.append(this.widgets);
        sb6.append("\ngraphSolved: ");
        sb6.append(this.graphSolved);
        sb6.append("\nlinearSolved: ");
        return d.j(this.linearSolved, "\n", sb6);
    }
}
